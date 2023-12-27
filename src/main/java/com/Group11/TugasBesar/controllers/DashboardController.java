package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.Group11.TugasBesar.annotations.CheckAdmin;
import com.Group11.TugasBesar.models.Booking;
import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.booking.BookingService;
import com.Group11.TugasBesar.services.kost.KostService;
import com.Group11.TugasBesar.services.pencariKost.PencariKostService;
import com.Group11.TugasBesar.services.user.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@CheckAdmin
@SpringBootApplication
@Controller
public class DashboardController {

    @Autowired
    private PencariKostService pencariKostService;

    @Autowired
    private KostService kostService;

    @Autowired
    private BookingService bookingService;
    
    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "redirect:/dashboard/pencariKost";
    }

    @GetMapping("/dashboard/kost")
    public String viewKosts(Model model) {
        
        Response kostResponse = kostService.getKosts();
        List<Kost> kosts = (List<Kost>) kostResponse.getData();

        model.addAttribute("kosts", kosts);

        return "dashboard/adminKost";
    }

    @PostMapping("/dashboard/kost/{kost_id}")
    public String kostApprove(@RequestParam(value = "approved") String approved, @PathVariable(value="kost_id") int kost_id, Model model) {
        
        // System.out.println(kost_id);
        // System.out.println(approved);

        if (approved.equals("true")) {
            Response response = kostService.setKostApproved(kost_id, true);
            Kost kost = (Kost) response.getData();
            System.out.println(kost.isApproved());
        }
        else if (approved.equals("false")) {
            Response response= kostService.setKostApproved(kost_id, false);
            Kost kost = (Kost) response.getData();
            System.out.println(kost.isApproved());
        }
        else {
            model.addAttribute("message", "Unexpected error. Check om DashboardController");
            return "unexpectedError";
        }
        
        return "redirect:/dashboard/kost";
    }
    
    
    @GetMapping("/dashboard/booking")
    public String viewPayments(Model model) {

        Response bookingResponse = bookingService.getBookings();
        List<Booking> bookings = (List<Booking>) bookingResponse.getData();
        
        model.addAttribute("bookings", bookings);
        return "dashboard/adminBooking";
    }

    @PostMapping("/dashboard/booking/{booking_id}")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    

    @GetMapping("/dashboard/pencariKost")
    public String viewPencariKosts(Model model) {

        Response pencariKostResponse = pencariKostService.getPencariKosts();
        List<PencariKost> pencariKosts = (List<PencariKost>) pencariKostResponse.getData();
        
        model.addAttribute("pencariKosts", pencariKosts);
        return "dashboard/adminPencariKost";
    }
    
}
