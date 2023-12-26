package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.Group11.TugasBesar.annotations.CheckAdmin;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.pencariKost.PencariKostService;
import com.Group11.TugasBesar.services.user.UserService;

import org.springframework.web.bind.annotation.GetMapping;


@CheckAdmin
@SpringBootApplication
@Controller
public class DashboardController {

    @Autowired
    private PencariKostService pencariKostService;

    @Autowired
    private UserService userService;
    
    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "redirect:/dashboard/pencariKost";
    }

    @GetMapping("/dashboard/pencariKost")
    public String viewPencariKosts(Model model) {

        Response pencariKostResponse = pencariKostService.getPencariKosts();
        List<PencariKost> pencariKosts = (List<PencariKost>) pencariKostResponse.getData();
        
        model.addAttribute("pencariKosts", pencariKosts);
        return "dashboard/adminPencariKost";
    }
    
}
