package com.example.soapconsumer.service;

import com.example.soapconsumer.client.Country;
import com.example.soapconsumer.client.Currency;
import com.example.soapconsumer.client.GetCountryResponse;
import com.example.soapconsumer.config.client.CountryClient;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryClient countryClient;

    public CountryService(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    public Country getCountryInfo(String countryName) {
        GetCountryResponse response = countryClient.getCountry(countryName);
        return response.getCountry();
    }

    public String getCapital(String countryName) {
        return getCountryInfo(countryName).getCapital();
    }

    public Currency getCurrency(String countryName) {
        return getCountryInfo(countryName).getCurrency();
    }

    public long getPopulation(String countryName) {
        return getCountryInfo(countryName).getPopulation();
    }
}
