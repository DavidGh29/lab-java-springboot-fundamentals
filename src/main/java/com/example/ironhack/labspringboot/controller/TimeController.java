package com.example.ironhack.labspringboot.controller;

import com.example.ironhack.labspringboot.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }
    @GetMapping("/time")
        public String getTime(){
            return "Current time is: " + timeService.getCurrentTime();
    }
    @GetMapping("/date")
    public String getDate() {
        return "Current date is: " + timeService.getCurrentDate();
    }
    @GetMapping("/day")
    public String getDay() {
        return "Current day is: " + timeService.getCurrentDayOfWeek();
    }
    @GetMapping("/all")
    public Map <String,String> getAll(){
        return Map.of(
                "Current Time is: ", timeService.getCurrentTime(),
                "Current Date is  ", timeService.getCurrentDate(),
                "Current Day is ", timeService.getCurrentDayOfWeek()
        );

    }
}

