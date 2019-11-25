package com.example.integrate.controllers;

import com.example.integrate.models.LegDescription;
import com.example.integrate.models.Segment;
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
        final String url = "https://api.flightstats.com/flex/schedules/rest/v1/json/flight/VN/650/departing/2019/11/10?appId=53714a7f&appKey=1353102468d8ac8a8b28d273251683fb";

        return getData(url);
    }

    @GetMapping("/airlines")
    public ResponseEntity index() {
        final String url = "https://api.flightstats.com/flex/airlines/rest/v1/json/all?appId=53714a7f&appKey=1353102468d8ac8a8b28d273251683fb";

        return getData(url);

    }

    public ResponseEntity getData(final String url) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Object object = objectMapper.readValue(new URL(url), Object.class);

            return new ResponseEntity(object, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(e, HttpStatus.valueOf(e.toString()));
        }
    }

    @GetMapping("/flight")
    public ResponseEntity getFlight() {
        final String url = "https://8d1335f1-4a5c-4231-8c27-426f56c4e2fe.mock.pstmn.io/gg";

        return getData(url);

    }

    @GetMapping("/test-ignore")
    public LegDescription testIgnore() {

        LegDescription legDescription = new LegDescription();
//        Segment segment = new Segment();
//        legDescription.setArrivalLocation("gg");
//        segment.setAbc("abc");
//        legDescription.setGg(segment);

        return legDescription;

    }
}
