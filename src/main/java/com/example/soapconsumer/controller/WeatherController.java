package com.example.soapconsumer.controller;

import com.example.soapconsumer.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/v1/weather")
    public String getWeather(@RequestParam String country) {
        return weatherService.getWeather(country);
    }
}