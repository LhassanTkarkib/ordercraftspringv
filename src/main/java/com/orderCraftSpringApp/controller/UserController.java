package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.classes.User;
import com.orderCraftSpringApp.model.enums.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @GetMapping("/user")
    public String showAdmin(Model model) {
        return "home/user";
    }

}