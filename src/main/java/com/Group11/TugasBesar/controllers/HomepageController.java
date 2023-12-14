package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller

public class HomepageController {
    @GetMapping("/homepage2")
    public String showHomePage() {
        return "homepage2"; // nama view atau template untuk halaman login
    }
}
