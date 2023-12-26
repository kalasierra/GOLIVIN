package com.Group11.TugasBesar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Group11.TugasBesar.models.Admin;
import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.User;
import com.Group11.TugasBesar.payloads.requests.LoginRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.services.user.UserService;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(HttpSession httpSession) {
        return "loginPage/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginRequest(LoginRequest loginRequest, HttpSession httpSession, Model model) {

        Response response = userService.login(loginRequest);

        try {
            User user = (User) response.getData();

            // If the user with the same username and password was found
            if (response.getStatus() == HttpStatus.FOUND.value()) {

                // Check if user is a PencariKost, PemilikKost, or Admin
                if (user.getPencariKost() != null) {
                    PencariKost pencariKost = user.getPencariKost();

                    response.setData(pencariKost);
                    httpSession.setAttribute("LOGGED_USER", pencariKost);
                    httpSession.setAttribute("USER_TYPE", "PencariKost");
                    System.out.println("User is a PencariKost");
                    return "redirect:/";
                }
                else if (user.getPemilikKost() != null) {
                    PemilikKost pemilikKost = user.getPemilikKost();
                    
                    response.setData(pemilikKost);
                    httpSession.setAttribute("LOGGED_USER", pemilikKost);
                    httpSession.setAttribute("USER_TYPE", "PemilikKost");
                    System.out.println("User is a PemilikKost");
                    return "redirect:/";
                }
                else if (user.getAdmin() != null) {
                    Admin admin = user.getAdmin();
                    
                    response.setData(admin);
                    httpSession.setAttribute("LOGGED_USER", admin);
                    httpSession.setAttribute("USER_TYPE", "Admin");
                    System.out.println("User is a Admin");
                    return "redirect:/";
                }
                else {
                    response.setMessage("User is not PencariKost, PemilikKost, or Admin");
                    System.out.println("Something is wrong");
                    return "unexpectedError";
                }
            }
            else {
                model.addAttribute("message", response.getMessage());
                return "unexpectedError";
            }
        } catch (Exception e) {
            model.addAttribute("message", response.getMessage());
            return "unexpectedError";
        }
    }

    @GetMapping("/login/admin")
    public String loginAsAdmin() {
        return "loginPage/loginAdmin";
    }
    
}
