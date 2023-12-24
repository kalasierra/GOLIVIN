package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.payloads.requests.KostRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.kost.KostService;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class KostController {

    @Autowired
    private KostService kostService;

    @GetMapping(value = "/kost")
    public String kostPage() {
        return "kostOption";
    }

    @GetMapping(value = "/kost/create")
    public String createKostPage(HttpSession httpSession) {
        if (httpSession.getAttribute("USER_TYPE").equals("PemilikKost")) {
            return "kostCreate";
        } else {
            return "login";
        }
    }

    @PostMapping(value = "/kost/create")
    public String createKost(HttpSession httpSession, KostRequest kostRequest, Model model) {
        try {
            PemilikKost pemilikKost = (PemilikKost) httpSession.getAttribute("LOGGED_USER");
            kostRequest.setPemilikKost(pemilikKost);
            Response response = kostService.addKost(kostRequest);

            if(response.getStatus() == HttpStatus.CREATED.value()) {
                return "indexPemilik";
            }
            else {
                model.addAttribute("message", response.getMessage());
                return "unexpectedError";
            }
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return "unexpectedError";
        }
    }

    @GetMapping(value = "/kost/search")
    public String searchKostPage(HttpSession httpSession, Model model) {
        try {
            Response response = kostService.getKosts();

            List<Kost> kosts = (List<Kost>) response.getData();

            // Passing all the kost to the JSP
            model.addAttribute("kosts", kosts);

            return "kostList";
        } catch (Exception e) {
            return "test";
        }
    }

    @GetMapping("/kost/{uuid}")
    public String getKostById(@PathVariable("uuid") String id) {
        return "test";
    }

}
