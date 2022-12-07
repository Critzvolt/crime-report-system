package com.crimereportsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crimereportsystem.entity.ResponderTeam;
import com.crimereportsystem.service.ResponderTeamService;

@Controller
public class ResponderTeamController {

    private ResponderTeamService responderTeamService;

    public ResponderTeamController(ResponderTeamService responderTeamService) {
        super();
        this.responderTeamService = responderTeamService;
    }

    // handler method to handle list responderTeams and return mode and view
    @GetMapping("/responderTeams")
    public String listResponderTeams(Model model) {
        model.addAttribute("responderTeams", responderTeamService.getAllResponderTeams());
        return "responderTeams";
    }

    @GetMapping("/responderTeams/new")
    public String createResponderTeamForm(Model model) {

        // create responderTeam object to hold responderTeam form data
        ResponderTeam responderTeam = new ResponderTeam();
        model.addAttribute("responderTeam", responderTeam);
        return "create_responderTeam";

    }

    @PostMapping("/responderTeams")
    public String saveResponderTeam(@ModelAttribute("responderTeam") ResponderTeam responderTeam) {
        responderTeamService.saveResponderTeam(responderTeam);
        return "redirect:/responderTeams";
    }

    @GetMapping("/responderTeams/edit/{id}")
    public String editResponderTeamForm(@PathVariable Long id, Model model) {
        model.addAttribute("responderTeam", responderTeamService.getResponderTeamById(id));
        return "edit_responderTeam";
    }

    @PostMapping("/responderTeams/{id}")
    public String updateResponderTeam(@PathVariable Long id,
                                      @ModelAttribute("responderTeam") ResponderTeam responderTeam,
                                      Model model) {

        // get responderTeam from database by id
        ResponderTeam existingResponderTeam = responderTeamService.getResponderTeamById(id);
        existingResponderTeam.setId(id);
        existingResponderTeam.setStation(responderTeam.getStation());
        existingResponderTeam.setCurrentPlace(responderTeam.getCurrentPlace());
        existingResponderTeam.setCurrentJob(responderTeam.getCurrentJob());

        // save updated responderTeam object
        responderTeamService.updateResponderTeam(existingResponderTeam);
        return "redirect:/responderTeams";
    }

    // handler method to handle delete responderTeam request

    @GetMapping("/responderTeams/{id}")
    public String deleteResponderTeam(@PathVariable Long id) {
        responderTeamService.deleteResponderTeamById(id);
        return "redirect:/responderTeams";
    }

}
