package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.payloads.requests.KostRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.kost.KostService;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class LandingPage {

    @Autowired
    private KostService kostService;
    
    @RequestMapping({"/", "/home"})
    public String home(HttpSession httpSession, Model model) {
        System.out.println("In LandingPage.jsp\nUSER_TYPE: " + httpSession.getAttribute("USER_TYPE"));

        if      (httpSession.getAttribute("USER_TYPE") == null)                   {return "index";}
        else if (httpSession.getAttribute("USER_TYPE").equals("PencariKost")) {return "indexPencari";}
        else if (httpSession.getAttribute("USER_TYPE").equals("PemilikKost")) {

            KostRequest request = new KostRequest();

            PemilikKost currentPemilikKost = (PemilikKost) httpSession.getAttribute("LOGGED_USER");
            request.setPemilikKost(currentPemilikKost);
            Response response = kostService.getKostByPemilikKosts(request);
            List<Kost> kosts = (List<Kost>) response.getData();

            model.addAttribute("kosts", kosts);
            return "indexPemilik";
        }
        else if (httpSession.getAttribute("USER_TYPE").equals("Admin"))       {return "index";}
        else                                                                           {return "test";}
    }
}
