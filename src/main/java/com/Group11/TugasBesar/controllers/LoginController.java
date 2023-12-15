package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // nama view atau template untuk halaman login
    }
}