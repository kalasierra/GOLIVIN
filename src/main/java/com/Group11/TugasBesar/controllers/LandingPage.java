package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class LandingPage {
    
    @RequestMapping({"/", "/home"})
    public String home(HttpSession httpSession) {
        httpSession.setAttribute("LOGGED_USER", null);
        httpSession.setAttribute("USER_TYPE", null);
        return "index";
    }
}
