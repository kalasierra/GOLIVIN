package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Group11.TugasBesar.payloads.requests.BookRequest;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.book.BookService;
import com.Group11.TugasBesar.services.user.UserService;

import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class RegistrasiController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "registrasi", method = RequestMethod.GET)
    public String registrasiPage(){
        return "registrasi";
    }

    // @RequestMapping(value = "registrasi", method = RequestMethod.POST)
    // public String homepage2Page(@RequestParam String username, @RequestParam String password, @RequestParam String phoneNumber){
    //     System.out.println(username);
    //     return "homepage2";
    // }

    @RequestMapping(value = "registrasi", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded")
    public ResponseEntity<?> homepage2Page(UserRequest userRequest){
        try {
            System.out.println(userRequest.getUsername());
            Response response = userService.addUser(userRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
          } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
          }
    }

}
