package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
