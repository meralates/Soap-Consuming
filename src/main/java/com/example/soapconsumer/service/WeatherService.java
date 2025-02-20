package com.example.soapconsumer.service;

import com.example.soapconsumer.model.Root;
import com.example.soapconsumer.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeather(String city) {
        String apiKey = "2f0722b85b18523dc9bf17c47eb3b06e";
        String url = UriComponentsBuilder.fromHttpUrl("http://api.openweathermap.org/data/2.5/weather")
                .queryParam("q", city)
                .queryParam("appid", apiKey)
                .queryParam("units", "metric")
                .build()
                .toUriString();

        Root response = restTemplate.getForObject(url, Root.class);

        return new WeatherResponse(
                city,
                response.getSys().getCountry(),
                response.getWeather().get(0).getDescription(),
                response.getMain().getTemp(),
                response.getMain().getHumidity()
        );
    }
}
