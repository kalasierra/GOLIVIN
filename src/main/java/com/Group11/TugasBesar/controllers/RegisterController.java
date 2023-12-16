package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.user.UserService;

@SpringBootApplication
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "register/pencari", method = RequestMethod.GET)
    public String registerAsPencari() {
        // Logika khusus untuk Pencari Kost
        return "registerAsPencari";
    }

    @RequestMapping(value = "register/pencari", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsPencari(UserRequest userRequest) {
        try {
            Response response = userService.addPencariKost(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @RequestMapping(value = "register/pemilik", method = RequestMethod.GET)
    public String registerAsPemilik() {
        // Logika khusus untuk Pemilik Kost
        return "registerAsPemilik";
    }

    @RequestMapping(value = "register/pemilik", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsPemilik(UserRequest userRequest) {
        try {
            Response response = userService.addPemilikKost(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
