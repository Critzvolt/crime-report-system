package com.crimereportsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crimereportsystem.entity.Station;
import com.crimereportsystem.service.StationService;

@Controller
public class StationController {

    private StationService stationService;

    public StationController(StationService stationService) {
        super();
        this.stationService = stationService;
    }

    // handler method to handle list stations and return mode and view
    @GetMapping("/stations")
    public String listStations(Model model) {
        model.addAttribute("stations", stationService.getAllStations());
        return "stations";
    }

    @GetMapping("/stations/new")
    public String createStationForm(Model model) {

        // create station object to hold station form data
        Station station = new Station();
        model.addAttribute("station", station);
        return "create_station";

    }

    @PostMapping("/stations")
    public String saveStation(@ModelAttribute("station") Station station) {
        stationService.saveStation(station);
        return "redirect:/stations";
    }

    @GetMapping("/stations/edit/{id}")
    public String editStationForm(@PathVariable Long id, Model model) {
        model.addAttribute("station", stationService.getStationById(id));
        return "edit_station";
    }

    @PostMapping("/stations/{id}")
    public String updateStation(@PathVariable Long id,
                                @ModelAttribute("station") Station station,
                                Model model) {

        // get station from database by id
        Station existingStation = stationService.getStationById(id);
        existingStation.setId(id);
        existingStation.setAddress(station.getAddress());
        existingStation.setPhoneNumber(station.getPhoneNumber());

        // save updated station object
        stationService.updateStation(existingStation);
        return "redirect:/stations";
    }

    // handler method to handle delete station request

    @GetMapping("/stations/{id}")
    public String deleteStation(@PathVariable Long id) {
        stationService.deleteStationById(id);
        return "redirect:/stations";
    }

}
