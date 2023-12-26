package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Group11.TugasBesar.models.Admin;
import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.models.PencariKost;
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
        System.out.println("In LandingPage.jsp");
        System.out.println("USER_TYPE           : " + httpSession.getAttribute("USER_TYPE"));
        System.out.println("LOGGED_USER is null?: " + (httpSession.getAttribute("LOGGED_USER") == null));

        Object user = httpSession.getAttribute("LOGGED_USER");

        if      (user == null)                  {return "landingPage/index";}
        else if (user instanceof PencariKost)   {return "landingPage/indexPencariKost";}
        else if (user instanceof PemilikKost)   {
            
            PemilikKost currentPemilikKost = (PemilikKost) httpSession.getAttribute("LOGGED_USER");
            // List<Kost> kosts = currentPemilikKost.getKosts();
            Response response = kostService.getKostByPemilikKost(currentPemilikKost);
            List<Kost> kosts = (List<Kost>) response.getData();

            model.addAttribute("kosts", kosts);
            return "landingPage/indexPemilikKost";
        }
        else if (user instanceof Admin)         {return "redirect:/dashboard";}
        else                                    {return "test";}
    }
}
