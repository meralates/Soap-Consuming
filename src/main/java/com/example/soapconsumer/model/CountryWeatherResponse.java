package com.example.soapconsumer.model;

import com.example.soapconsumer.client.Currency;

public class CountryWeatherResponse {
    private String capital;
    private String currency;
    private long population;
    private String weather;
    private double temperature;
    private int humidity;

    public CountryWeatherResponse(String capital, Currency currency, long population, String weather, double temperature, int humidity) {
        this.capital = capital;
        this.currency = currency.name();
        this.population = population;
        this.weather = weather;
        this.temperature = temperature;
        this.humidity = humidity;
    }
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
