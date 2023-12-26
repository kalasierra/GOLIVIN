package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import com.Group11.TugasBesar.annotations.CheckAdmin;
import org.springframework.web.bind.annotation.GetMapping;


@CheckAdmin
@SpringBootApplication
@Controller
public class DashboardController {
    
    @GetMapping("/dashboard")
    public String viewPencariKosts() {
        return "dashboard/adminPencariKost";
    }
    
}
