package com.montrealcollege.exercise15.controller;

import com.montrealcollege.exercise15.model.Countries;
import com.montrealcollege.exercise15.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/countries")
public class CountriesController {

    @Autowired
    private CountriesService service;

    @GetMapping("/list")
    public String showCountries(Model model) {
        List<Countries> countries = service.getCountries();
        model.addAttribute("countries", countries);
        return "WEB-INF/views/countries";
    }
}
