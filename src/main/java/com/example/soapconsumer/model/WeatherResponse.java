package com.example.soapconsumer.model;


public class WeatherResponse {
    private final String city;
    private final String country;
    private final String weather;
    private final double temperature;
    private final int humidity;

    public WeatherResponse(String city, String country, String weather, double temperature, int humidity) {
        this.city = city;
        this.country = country;
        this.weather = weather;
        this.temperature = temperature;
        this.humidity = humidity;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getWeather() {
        return weather;
    }
    public double getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }

}
