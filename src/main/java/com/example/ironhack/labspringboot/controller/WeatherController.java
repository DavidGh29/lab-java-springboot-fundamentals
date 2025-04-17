package com.example.ironhack.labspringboot.controller;

import com.example.ironhack.labspringboot.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/temperature")
        public String getTemperature(){
            return "Current temperature: " + weatherService.getCurrentTemperature();
    }
    @GetMapping("/condition")
        public String getCondition() {
            return "Current weather condition: " + weatherService.getWeatherCondition();
    }
    @GetMapping("/wind")
        public String getWind(){
            return "Current wind speed: " + weatherService.getWindSpeed();
    }
    @GetMapping("/all")
        public Map<String, String> getAll(){
        return Map.of(
                "Current Temperature is ", weatherService.getCurrentTemperature() + "°C",
                "Current Weather Condition ", weatherService.getWeatherCondition(),
                "Current wind speed ", weatherService.getWindSpeed() + "km/h"
        );
    }
}


