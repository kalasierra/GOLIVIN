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
import org.springframework.web.bind.annotation.RequestParam;



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
    
    @GetMapping("/dashboard/booking")
    public String viewPayments(Model model) {

        Response bookingResponse = bookingService.getBookings();
        List<Booking> bookings = (List<Booking>) bookingResponse.getData();
        
        model.addAttribute("bookings", bookings);
        return "dashboard/adminBooking";
    }

    @GetMapping("/dashboard/pencariKost")
    public String viewPencariKosts(Model model) {

        Response pencariKostResponse = pencariKostService.getPencariKosts();
        List<PencariKost> pencariKosts = (List<PencariKost>) pencariKostResponse.getData();
        
        model.addAttribute("pencariKosts", pencariKosts);
        return "dashboard/adminPencariKost";
    }
    
}
