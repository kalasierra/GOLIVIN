package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Group11.TugasBesar.annotations.CheckLoggedIn;
import com.Group11.TugasBesar.annotations.CheckPencariKost;

import jakarta.servlet.http.HttpSession;

@CheckPencariKost
@SpringBootApplication
@Controller
public class TestController {

    @CheckLoggedIn
    @RequestMapping(value = "/test")
    public String testPage(HttpSession session) {
        return "success";   
    }
}
