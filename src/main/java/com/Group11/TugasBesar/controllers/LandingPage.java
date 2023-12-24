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
        System.out.println("In LandingPage.jsp\nUSER_TYPE: " + httpSession.getAttribute("USER_TYPE"));

        if      (httpSession.getAttribute("USER_TYPE") == null)                   {return "index";}
        else if (httpSession.getAttribute("USER_TYPE").equals("PencariKost")) {return "indexPencari";}
        else if (httpSession.getAttribute("USER_TYPE").equals("PemilikKost")) {return "indexPemilik";}
        else if (httpSession.getAttribute("USER_TYPE").equals("Admin"))       {return "index";}
        else                                                                           {return "test";}
    }
}
