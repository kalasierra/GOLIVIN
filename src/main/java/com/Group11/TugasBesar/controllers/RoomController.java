package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Group11.TugasBesar.annotations.CheckPencariKost;
import com.Group11.TugasBesar.models.Booking;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.BookingRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.booking.BookingService;
import com.Group11.TugasBesar.services.room.RoomService;

import jakarta.servlet.http.HttpSession;

@CheckPencariKost
@SpringBootApplication
@Controller
public class RoomController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private RoomService roomService;
    
    @GetMapping("/room/{room_id}/book")
    public String bookRoom(@PathVariable("room_id") int room_id, HttpSession httpSession, Model model) {

        PencariKost pencariKost = (PencariKost) httpSession.getAttribute("LOGGED_USER");

        Response roomResponse = roomService.getRoomById(room_id);
        Room room = (Room) roomResponse.getData();

        if (room.isBooked() == false) {
            roomService.setRoomBooking(room_id, true);

            BookingRequest bookingRequest = new BookingRequest();
            bookingRequest.setEntryDate(null);
            bookingRequest.setExitDate(null);
            bookingRequest.setPaymentStatus("unpaid");
            bookingRequest.setPencariKost(pencariKost);
            bookingRequest.setRoom(room);
    
            Response bookingResponse = bookingService.addBooking(bookingRequest);
            Booking booking = (Booking) bookingResponse.getData();
    
            return "redirect:/booking/" + booking.getBooking_id();
        }
        else {
            model.addAttribute("message", "room already booked");
            return "unexpectedError";
        }

    }
    
}
