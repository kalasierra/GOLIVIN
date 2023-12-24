package com.Group11.TugasBesar.services.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.requests.RoomRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.RoomRepository;

public class RoomServiceImpl implements RoomService{
    
    @Autowired
    private RoomRepository roomRepository;
    
    @Override
    public Response addRoom(RoomRequest request) {

        Room room = new Room();
        room.setPrice(request.getPrice());
        room.setDescription(request.getDescription());
        room.setBooked(request.isBooked());
        room.setKost(request.getKost());
        room = roomRepository.save(room);

        Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("Kost created successfully!");
		response.setData(room);

        return response;
    }
    
    @Override
    public Response getRooms() {
        List<Room> rooms = roomRepository.findAll();

        Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("Success!");
		response.setData(rooms);

        return response;
    }
}
