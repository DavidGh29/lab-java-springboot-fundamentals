package com.example.ironhack.labspringboot.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {

    public String getCurrentTime(){
        return LocalTime.now().toString();
    }
    public String getCurrentDate(){
        return LocalDate.now().toString();
    }
    public String getCurrentDayOfWeek(){
        return LocalDate.now().getDayOfWeek().toString();
    }
}
