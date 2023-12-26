package com.Group11.TugasBesar.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.Group11.TugasBesar.annotations.CheckPencariKost;
import com.Group11.TugasBesar.models.Booking;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.BookingRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.booking.BookingService;
import com.Group11.TugasBesar.services.room.RoomService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CheckPencariKost
@SpringBootApplication
@Controller
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @GetMapping("/booking/{booking_id}")
    public String bookingLanding(@PathVariable("booking_id") int id) {
        return "redirect:/booking/" + id + "/date";
    }

    @GetMapping("/booking/{booking_id}/date")
    public String bookingDate(@PathVariable("booking_id") int id, Model model) {
        model.addAttribute("booking_id", id);
        return "bookingPage/bookingDate";
    }

    @GetMapping("/booking/{booking_id}/payment")
    public String bookingPayment(
            @PathVariable("booking_id") int booking_id,

            HttpSession httpSession,

            @RequestParam("start-date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,

            @RequestParam("end-date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
            
            Model model) {

        Response bookingResponse = bookingService.getBookingById(booking_id);
        Booking booking = (Booking) bookingResponse.getData();

        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setEntryDate(startDate);
        bookingRequest.setExitDate(endDate);
        bookingRequest.setPaymentStatus(booking.getPaymentStatus());
        bookingRequest.setPencariKost(booking.getPencariKost());
        bookingRequest.setRoom(booking.getRoom());
        bookingResponse = bookingService.updateBookingById(booking_id, bookingRequest);

        // Take the price rate from the the said room
        Room room = booking.getRoom();
        long price = room.getPrice();

        //Calculate the number of days passed 
        long durationInMilliseconds = endDate.getTime() - startDate.getTime();          // Calculate the number of milliseconds between start date and end date
        double numberOfDays = TimeUnit.MILLISECONDS.toDays(durationInMilliseconds);     // Convert milliseconds to days
        double numberOfMonths = numberOfDays / 30.0;

        // Calculate and round the price
        double newPrice = price * numberOfMonths;
        long roundedPrice = Math.round(newPrice / 10.0) * 10;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        model.addAttribute("start_date", dateFormat.format(startDate));
        model.addAttribute("end_date", dateFormat.format(endDate));
        model.addAttribute("price", roundedPrice);
        model.addAttribute("booking_id", booking_id);
        
        return "bookingPage/bookingPayment";
    }
    
    @GetMapping("/booking/{booking_id}/confirm")
    public String bookReque(@PathVariable("booking_id") int booking_id) {

        Response bookingResponse = bookingService.getBookingById(booking_id);
        Booking booking = (Booking) bookingResponse.getData();

        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setEntryDate(booking.getEntryDate());
        bookingRequest.setExitDate(booking.getExitDate());
        bookingRequest.setPaymentStatus("paid");
        bookingRequest.setPencariKost(booking.getPencariKost());
        bookingRequest.setRoom(booking.getRoom());
        bookingResponse = bookingService.updateBookingById(booking_id, bookingRequest);
        
        return "redirect:/";
    }
    
    
}
