package com.Group11.TugasBesar.services.kost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.payloads.requests.KostRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.KostRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class KostServiceImpl implements KostService{
    
    @Autowired
    private KostRepository kostRepository;

    public Response addKost(KostRequest request) {

        Kost kost = new Kost();
        kost.setName(request.getName());
        kost.setAddress(request.getAddress());
        kost.setAllowedMale(request.isAllowedMale());
        kost.setAllowedFemale(request.isAllowedFemale());
        kost.setPemilikKost(request.getPemilikKost());
        kost = kostRepository.save(kost);

        Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("Kost created successfully!");
		response.setData(kost);

        return response;
    }

}
