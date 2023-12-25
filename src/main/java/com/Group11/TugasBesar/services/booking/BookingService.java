package com.Group11.TugasBesar.services.booking;

import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.BookingRequest;
import com.Group11.TugasBesar.payloads.responses.Response;

public interface BookingService {

    Response addBooking(BookingRequest bookingRequest);

    Response updateBookingById(int id, BookingRequest bookingRequest);

    Response getBookings();

    Response getBookingById(int id);

    Response getBookingByRoom(Room room);

    Response getBookingByPencariKost(PencariKost pencariKost);
    
}
