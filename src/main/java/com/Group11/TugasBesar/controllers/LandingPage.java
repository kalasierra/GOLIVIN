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
        if      (httpSession.getAttribute("USER_TYPE") == null)          {return "index";}
        else if (httpSession.getAttribute("USER_TYPE") == "PencariKost") {return "index";}
        else if (httpSession.getAttribute("USER_TYPE") == "PemilikKost") {return "indexPemilik";}
        else if (httpSession.getAttribute("USER_TYPE") == "Admin")       {return "index";}
        else                                                                  {return "index";}
    }
}
