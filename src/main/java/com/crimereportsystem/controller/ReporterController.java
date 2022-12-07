package com.crimereportsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crimereportsystem.entity.Reporter;
import com.crimereportsystem.service.ReporterService;

@Controller
public class ReporterController {

    private ReporterService reporterService;

    public ReporterController(ReporterService reporterService) {
        super();
        this.reporterService = reporterService;
    }

    // handler method to handle list reporters and return mode and view
    @GetMapping("/reporters")
    public String listReporters(Model model) {
        model.addAttribute("reporters", reporterService.getAllReporters());
        return "reporters";
    }

    @GetMapping("/reporters/new")
    public String createReporterForm(Model model) {

        // create reporter object to hold reporter form data
        Reporter reporter = new Reporter();
        model.addAttribute("reporter", reporter);
        return "create_reporter";

    }

    @PostMapping("/reporters")
    public String saveReporter(@ModelAttribute("reporter") Reporter reporter) {
        reporterService.saveReporter(reporter);
        return "redirect:/reporters";
    }

    @GetMapping("/reporters/edit/{id}")
    public String editReporterForm(@PathVariable Long id, Model model) {
        model.addAttribute("reporter", reporterService.getReporterById(id));
        return "edit_reporter";
    }

    @PostMapping("/reporters/{id}")
    public String updateReporter(@PathVariable Long id,
                                 @ModelAttribute("reporter") Reporter reporter,
                                 Model model) {

        // get reporter from database by id
        Reporter existingReporter = reporterService.getReporterById(id);
        existingReporter.setId(id);
        existingReporter.setName(reporter.getName());
        existingReporter.setPhoneNumber(reporter.getPhoneNumber());
        existingReporter.setAddress(reporter.getAddress());
        existingReporter.setLogin(reporter.getLogin());
        existingReporter.setPassword(reporter.getPassword());

        // save updated reporter object
        reporterService.updateReporter(existingReporter);
        return "redirect:/reporters";
    }

    // handler method to handle delete reporter request

    @GetMapping("/reporters/{id}")
    public String deleteReporter(@PathVariable Long id) {
        reporterService.deleteReporterById(id);
        return "redirect:/reporters";
    }

}
