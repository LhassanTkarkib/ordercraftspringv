package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.classes.User;
import com.orderCraftSpringApp.model.enums.UserRole;
import com.orderCraftSpringApp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String showAdmin(Model model) {
        Iterable<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "home/admin";
    }

    @GetMapping("/admin/create")
    public String showCreateUserForm(Model model) {
        model.addAttribute("user", new User());
        return "home/admindash/createUser";
    }

    @PostMapping("/admin/create")
    public String processCreateUser(@ModelAttribute("user") User user) {
        if (user.getRole() == null) {
            user.setRole(UserRole.USER);
        }
        userService.saveUser(user);
        return "redirect:/admin";
    }


    @GetMapping("/admin/edit/{id}")
    public String showEditUserForm(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "home/admindash/editUser";
    }

    @PostMapping("/admin/edit/{id}")
    public String processEditUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
        user.setUserID(id);
        userService.updateUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "redirect:/admin";
    }
}
