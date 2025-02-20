package com.example.soapconsumer.controller;

import com.example.soapconsumer.model.WeatherResponse;
import com.example.soapconsumer.service.WeatherService;
import com.example.soapconsumer.config.client.CountryClient;
import com.example.soapconsumer.client.GetCountryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;
    private final CountryClient countryClient;

    public WeatherController(WeatherService weatherService, CountryClient countryClient) {
        this.weatherService = weatherService;
        this.countryClient = countryClient;
    }

    @GetMapping("/api/v1/weather")
    public WeatherResponse getWeather(@RequestParam String country) {
        GetCountryResponse response = countryClient.getCountry(country);
        String capital = response.getCountry().getCapital();
        return weatherService.getWeather(capital);
    }
}
