package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.classes.User;
import com.orderCraftSpringApp.model.enums.UserRole;
import com.orderCraftSpringApp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "auth/login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String email, @RequestParam String password) {

        User authenticatedUser = userService.authenticateUser(email, password);

        if (authenticatedUser != null) {
            if (authenticatedUser.getRole() == UserRole.ADMIN) {
                return "redirect:/admin";
            }else if (authenticatedUser.getRole() == UserRole.USER) {
                return "redirect:/user";
            }
            return "redirect:/home";
        } else {
            return "redirect:/login?error";
        }
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "auth/register";
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute User user) {
        if (user.getRole() == null) {
            user.setRole(UserRole.USER);
        }
        userService.saveUser(user);

        if (user != null) {
            return "redirect:/login";
        } else {
            return "redirect:/register?error";
        }
    }
}
