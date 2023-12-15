package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller

public class RoleController {
    @GetMapping("/role")
    public String showRolePage() {
        return "role"; // nama view atau template untuk halaman login
    }
}
