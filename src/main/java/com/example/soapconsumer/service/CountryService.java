package com.example.soapconsumer.service;

import com.example.soapconsumer.client.GetCountryResponse;
import com.example.soapconsumer.config.client.CountryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryClient countryClient;


    public CountryService(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    public String getCapital(String country) {
        GetCountryResponse response = countryClient.getCountry(country);
        String capital = response.getCountry().getCapital();
        return capital;
    }

}
