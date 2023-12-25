package com.Group11.TugasBesar.services.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.Group11.TugasBesar.models.Booking;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.BookingRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.BookingRepository;

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
    public Response getBookingByPencariKost(PencariKost pencariKost) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response getBookingByRoom(Room room) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response getBookings() {
        // TODO Auto-generated method stub
        return null;
    }
}
