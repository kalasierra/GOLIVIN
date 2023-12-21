package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.user.UserService;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String testPage(HttpSession session) {
        if (session.getAttribute("here") == null) {
            session.setAttribute("here", 0);
        }
        int temp = (Integer) session.getAttribute("here");
        session.setAttribute("here", temp += 1);
        return Integer.toString((Integer)session.getAttribute("here"));
    }
}
