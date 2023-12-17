package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
// import com.Group11.TugasBesar.services.pemilikKost.PemilikKostService;
import com.Group11.TugasBesar.services.user.UserService;

@SpringBootApplication
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;
<<<<<<< Updated upstream
    
    @RequestMapping(value = "register/pencari", method = RequestMethod.GET)
    public String registerAsPencari() {
        // Logika khusus untuk Pencari Kost
        return "registerAsPencari";
=======

    // @Autowired
    // private PemilikKostService pemilikKostService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String registerPage() {
        return "registrationDecision";
    }

    @RequestMapping(value = "register/decision", method = RequestMethod.GET)
    public String PencariOrPemilik(@RequestParam int userType) {
        if (userType == 1) {return "registerAsPencari";}
        else if (userType == 2) {return "registerAsPemilik";}
        else {return "unexpectedError";}
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======
    @RequestMapping(value = "register/admin", method = RequestMethod.POST)
    public ResponseEntity<?> registerAsAdmin(@RequestBody UserRequest userRequest) {
        try {
            Response response = userService.addAdmin(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
>>>>>>> Stashed changes
}
