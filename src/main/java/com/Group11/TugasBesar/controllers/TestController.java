package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class TestController {

    @RequestMapping(value = "datakost", method = RequestMethod.GET)
    public String registerPage() {

        return "datakos";
    }
}
