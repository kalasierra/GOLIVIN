package com.Group11.TugasBesar.services.kost;

import com.Group11.TugasBesar.payloads.requests.KostRequest;
import com.Group11.TugasBesar.payloads.responses.Response;

public interface KostService {

    Response addKost(KostRequest request);

    // Response getKost();

    // Response getKostByName(String name);
    
}
