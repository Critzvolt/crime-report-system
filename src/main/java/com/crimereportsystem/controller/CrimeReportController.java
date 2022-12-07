package com.crimereportsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crimereportsystem.entity.CrimeReport;
import com.crimereportsystem.service.CrimeReportService;

@Controller
public class CrimeReportController {

    private CrimeReportService crimeReportService;

    public CrimeReportController(CrimeReportService crimeReportService) {
        super();
        this.crimeReportService = crimeReportService;
    }

    // handler method to handle list crimeReports and return mode and view
    @GetMapping("/crimeReports")
    public String listCrimeReports(Model model) {
        model.addAttribute("crimeReports", crimeReportService.getAllCrimeReports());
        return "crimeReports";
    }

    @GetMapping("/crimeReports/new")
    public String createCrimeReportForm(Model model) {

        // create crimeReport object to hold crimeReport form data
        CrimeReport crimeReport = new CrimeReport();
        model.addAttribute("crimeReport", crimeReport);
        return "create_crimeReport";

    }

    @PostMapping("/crimeReports")
    public String saveCrimeReport(@ModelAttribute("crimeReport") CrimeReport crimeReport) {
        crimeReportService.saveCrimeReport(crimeReport);
        return "redirect:/crimeReports";
    }

    @GetMapping("/crimeReports/edit/{id}")
    public String editCrimeReportForm(@PathVariable Long id, Model model) {
        model.addAttribute("crimeReport", crimeReportService.getCrimeReportById(id));
        return "edit_crimeReport";
    }

    @PostMapping("/crimeReports/{id}")
    public String updateCrimeReport(@PathVariable Long id,
                                    @ModelAttribute("crimeReport") CrimeReport crimeReport,
                                    Model model) {

        // get crimeReport from database by id
        CrimeReport existingCrimeReport = crimeReportService.getCrimeReportById(id);
        existingCrimeReport.setId(id);
        existingCrimeReport.setReporter(crimeReport.getReporter());
        existingCrimeReport.setDescription(crimeReport.getDescription());
        existingCrimeReport.setTime(crimeReport.getTime());
        existingCrimeReport.setPlace(crimeReport.getPlace());

        // save updated crimeReport object
        crimeReportService.updateCrimeReport(existingCrimeReport);
        return "redirect:/crimeReports";
    }

    // handler method to handle delete crimeReport request

    @GetMapping("/crimeReports/{id}")
    public String deleteCrimeReport(@PathVariable Long id) {
        crimeReportService.deleteCrimeReportById(id);
        return "redirect:/crimeReports";
    }

}
