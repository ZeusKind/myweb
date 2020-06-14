package com.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CWeather {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/get/{city}", method = RequestMethod.GET)
    public String extern(@PathVariable("city")String city) {
        String apiUrl = "http://wthrcdn.etouch.cn/weather_mini?city=" + city;

        ResponseEntity<String> forEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (200 == forEntity.getStatusCodeValue()){
            System.out.println(forEntity.getBody());
            return forEntity.getBody();
        }else {
            return "error with code : " + forEntity.getStatusCodeValue();
        }

    }

}
