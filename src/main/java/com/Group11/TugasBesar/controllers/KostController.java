package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.payloads.requests.KostRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.book.BookService;
import com.Group11.TugasBesar.services.kost.KostService;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class KostController {

    @Autowired
    private BookService bookService;

    @Autowired
    private KostService kostService;

    @RequestMapping(value = "/kost", method = RequestMethod.GET)
    public String kostPage() {
        return "kost";
    }
    
    @GetMapping(value = "/kost/create")
    public String createKostPage(HttpSession httpSession) {

        PemilikKost pemilikKost;

        try                          {pemilikKost = (PemilikKost) httpSession.getAttribute("LOGGED_USER");}
        catch (ClassCastException e) {return "login";}

        if (pemilikKost != null) {return "createKost";}
        else                     {return "login";}

    }

    @PostMapping(value = "/kost/create")
    public ResponseEntity<?> createKost(HttpSession httpSession, KostRequest kostRequest) {
        try {
            PemilikKost pemilikKost = (PemilikKost) httpSession.getAttribute("LOGGED_USER");
            kostRequest.setPemilikKost(pemilikKost);
            Response response = kostService.addKost(kostRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
