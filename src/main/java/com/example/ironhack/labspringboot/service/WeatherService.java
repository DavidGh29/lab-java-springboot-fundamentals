package com.example.ironhack.labspringboot.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    public int getCurrentTemperature(){
        return random.nextInt(40) - 10;
    }

    public String getWeatherCondition (){
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions [random.nextInt(conditions.length)];
    }

    public int getWindSpeed(){
        return random.nextInt(100);
    }

    public WeatherService() {
    }

    public Random getRandom() {
        return random;
    }

}
