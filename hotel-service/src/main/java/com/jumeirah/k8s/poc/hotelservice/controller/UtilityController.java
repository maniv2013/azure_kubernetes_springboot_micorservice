package com.jumeirah.k8s.poc.hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilityController {

    @GetMapping("/alive")
    String alive(){
        return "ok";
    }
}
