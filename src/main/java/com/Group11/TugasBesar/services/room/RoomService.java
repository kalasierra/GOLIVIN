package com.Group11.TugasBesar.services.room;

import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.payloads.requests.RoomRequest;
import com.Group11.TugasBesar.payloads.responses.Response;

public interface RoomService {

    Response addRoom(RoomRequest request);

    Response getRooms();

    Response getRoomByKost(Kost kost);
    
}
