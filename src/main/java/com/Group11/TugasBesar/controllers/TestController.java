package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Group11.TugasBesar.annotations.CheckLoggedIn;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class TestController {

    @CheckLoggedIn
    @RequestMapping(value = "/test")
    public String testPage(HttpSession session) {
        return "success";   
    }
}
