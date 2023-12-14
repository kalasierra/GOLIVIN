package com.Group11.TugasBesar.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

public class RegistrasiController {
    @RequestMapping(value = "/registrasi", method = RequestMethod.GET)

    public String registrasiPage(){
        return "/registrasi"
    }

    @RequestMapping(value = "/registrasi", method = RequestMethod.POST)

    public String homepage2Page(Model model @RequestParam String nama, @RequestParam String nomorHP, @RequestParam String Email, @RequestParam String pass, @RequestParam String passconfirm){
        return "homepage2"
    }
}
