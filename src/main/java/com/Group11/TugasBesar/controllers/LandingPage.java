package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Group11.TugasBesar.payloads.requests.BookRequest;
import com.Group11.TugasBesar.payloads.requests.LoginRequest;

@SpringBootApplication
@Controller
public class LandingPage {
    
    @RequestMapping({"/", "home"})
    public String home() {
        return "index";
    }

    // @RequestMapping(value = "/", method = RequestMethod.POST)
    // public String success(@RequestBody BookRequest bookRequest) {
        
    //     System.out.println(bookRequest.getJudul());
    //     return "welcome";
    // }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded")
    public String success(LoginRequest loginRequest) {
        //@RequestParam String email, @RequestParam String password
        System.out.println(loginRequest.getEmail());
        System.out.println(loginRequest.getPassword());
        return "success";
    }
}
