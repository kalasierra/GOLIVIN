package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.pemilikKost.PemilikKostService;
import com.Group11.TugasBesar.services.pencariKost.PencariKostService;
import com.Group11.TugasBesar.services.user.UserService;

@SpringBootApplication
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private PemilikKostService pemilikKostService;

    @Autowired
    private PencariKostService pencariKostService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String registerPage() {
        return "registrationDecision";
    }


    @RequestMapping(value = "/register/pencari", method = RequestMethod.GET)
    public String registerAsPencariInterface() {
        return "registerAsPencari";
    }

    @RequestMapping(value = "register/pencari", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsPencari(UserRequest userRequest) {
        try {
            Response response = pencariKostService.addPencariKost(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }


    @RequestMapping(value = "/register/pemilik", method = RequestMethod.GET)
    public String registerAsPemilikInterface() {
        return "registerAsPemilik";
    }

    @RequestMapping(value = "register/pemilik", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsPemilik(UserRequest userRequest) {
        try {
            Response response = pemilikKostService.addPemilikKost(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    

    @RequestMapping(value = "register/admin", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsAdmin(@RequestBody UserRequest userRequest) {
        try {
            Response response = userService.addAdmin(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
