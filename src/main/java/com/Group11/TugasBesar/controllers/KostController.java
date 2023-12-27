package com.Group11.TugasBesar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Group11.TugasBesar.models.Kost;
import com.Group11.TugasBesar.models.Room;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.kost.KostService;
import com.Group11.TugasBesar.services.room.RoomService;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class KostController {

    @Autowired
    private KostService kostService;

    @Autowired
    private RoomService roomService;

    @GetMapping(value = "/kost")
    public String kostPage() {
        return "searchPage/kostOption";
    }

    @GetMapping(value = "/kost/search")
    public String searchKostPage(HttpSession httpSession, Model model) {
        try {
            Response response = kostService.getKostByApproved(true);

            List<Kost> kosts = (List<Kost>) response.getData();

            // Passing all the kost to the JSP
            model.addAttribute("kosts", kosts);

            return "searchPage/kostSearch";
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return "unexpectedError";
        }
    }

    @GetMapping("/kost/{uuid}")
    public String getKostById(@PathVariable("uuid") int id, Model model) {
        
        Response response = kostService.getKostById(id);
        Kost kost = (Kost) response.getData();

        response = roomService.getRoomByKost(kost);
        List<Room> rooms = (List<Room>) response.getData();

        rooms.removeIf(room -> room.isBooked());

        model.addAttribute("rooms", rooms);
        model.addAttribute("address", kost.getAddress());

        return "searchPage/roomView";
    }

}
