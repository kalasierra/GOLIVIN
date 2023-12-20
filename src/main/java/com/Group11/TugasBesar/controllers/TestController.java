package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String registerPage(HttpSession session) {
        if (session.getAttribute("here") == null) {
            session.setAttribute("here", 0);
        }
        int temp = (Integer) session.getAttribute("here");
        session.setAttribute("here", temp += 1);
        return Integer.toString((Integer)session.getAttribute("here"));
    }
}
