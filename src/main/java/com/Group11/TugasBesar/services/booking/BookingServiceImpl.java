package com.Group11.TugasBesar.services.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import com.Group11.TugasBesar.models.Booking;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.BookingRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Response addBooking(BookingRequest bookingRequest) {
        
        Booking booking = new Booking();
        booking.setEntryDate(bookingRequest.getEntryDate());
        booking.setExitDate(bookingRequest.getExitDate());
        booking.setPaymentStatus(bookingRequest.getPaymentStatus());
        booking.setRoom(bookingRequest.getRoom());
        booking.setPencariKost(bookingRequest.getPencariKost());
        booking = bookingRepository.save(booking);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking created successfully!");
        response.setData(booking);
        
        return response;
    }
    
    @Override
    public Response updateBookingById(int id, BookingRequest bookingRequest) {
        
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("Booking is not found!");
        });

        booking.setEntryDate(bookingRequest.getEntryDate());
        booking.setExitDate(bookingRequest.getExitDate());
        booking.setPaymentStatus(bookingRequest.getPaymentStatus());
        booking.setPencariKost(bookingRequest.getPencariKost());
        booking.setRoom(bookingRequest.getRoom());

        booking = bookingRepository.save(booking);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking created successfully!");
        response.setData(booking);
        
        return response;
    }

    @Override
    public Response getBookings() {
        
        List<Booking> bookings = bookingRepository.findAll();
        
        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking was found");
        response.setData(bookings);

        return response;
    }

    @Override
    public Response getBookingById(int id) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("Booking is not found!");
        });

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking was found");
        response.setData(booking);

        return response;
    }
    
    @Override
    public Response getBookingByPencariKost(PencariKost pencariKost) {
        
        List<Booking> bookings = bookingRepository.findByPencariKost(pencariKost);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking was found");
        response.setData(bookings);

        return response;
    }

    @Override
    public Response getBookingByRoom(Room room) {

        Booking booking = bookingRepository.findByRoom(room).orElseThrow(() -> {
            throw new NoSuchElementException("Booking is not found!");
        });

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Booking was found");
        response.setData(booking);

        return response;
    }
}
