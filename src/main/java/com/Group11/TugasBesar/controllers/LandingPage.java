package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Group11.TugasBesar.payloads.requests.LoginRequest;

@SpringBootApplication
@Controller
public class LandingPage {
    
    @RequestMapping({"/", "/home"})
    public String home() {
        return "index";
    }
}
