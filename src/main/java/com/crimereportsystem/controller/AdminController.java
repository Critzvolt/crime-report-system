package com.crimereportsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crimereportsystem.entity.Admin;
import com.crimereportsystem.service.AdminService;

@Controller
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }

    // handler method to handle list admins and return mode and view
    @GetMapping("/admins")
    public String listAdmins(Model model) {
        model.addAttribute("admins", adminService.getAllAdmins());
        return "admins";
    }

    @GetMapping("/admins/new")
    public String createAdminForm(Model model) {

        // create admin object to hold admin form data
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "create_admin";

    }

    @PostMapping("/admins")
    public String saveAdmin(@ModelAttribute("admin") Admin admin) {
        adminService.saveAdmin(admin);
        return "redirect:/admins";
    }

    @GetMapping("/admins/edit/{id}")
    public String editAdminForm(@PathVariable Long id, Model model) {
        model.addAttribute("admin", adminService.getAdminById(id));
        return "edit_admin";
    }

    @PostMapping("/admins/{id}")
    public String updateAdmin(@PathVariable Long id,
                              @ModelAttribute("admin") Admin admin,
                              Model model) {

        // get admin from database by id
        Admin existingAdmin = adminService.getAdminById(id);
        existingAdmin.setId(id);
        existingAdmin.setName(admin.getName());
        existingAdmin.setPhoneNumber(admin.getPhoneNumber());
        existingAdmin.setAddress(admin.getAddress());
        existingAdmin.setLogin(admin.getLogin());
        existingAdmin.setPassword(admin.getPassword());

        // save updated admin object
        adminService.updateAdmin(existingAdmin);
        return "redirect:/admins";
    }

    // handler method to handle delete admin request

    @GetMapping("/admins/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdminById(id);
        return "redirect:/admins";
    }

}
