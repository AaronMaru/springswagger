package com.example.integrate.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
@RequestMapping("/api/v1")
public class ScheduleController {

    @GetMapping
    public ResponseEntity getSchedule() {
        String API = "https://api.flightstats.com/flex/schedules/rest/v1/json/flight/VN/650/departing/2019/11/10?appId=53714a7f&appKey=1353102468d8ac8a8b28d273251683fb";
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Object object = objectMapper.readValue(new URL(API), Object.class);
            return new ResponseEntity(object, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(e, HttpStatus.valueOf(e.toString()));
        }
    }
}
