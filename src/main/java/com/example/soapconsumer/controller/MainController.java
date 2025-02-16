package com.example.soapconsumer.controller;

import com.example.soapconsumer.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class MainController {
    private final CountryService countryService;

    public MainController(CountryService countryService) {
        this.countryService = countryService;
    }
@GetMapping("/getcapital")
    public String getCapital(@RequestParam String name) {

        return countryService.getCapital(name);
    }
}
