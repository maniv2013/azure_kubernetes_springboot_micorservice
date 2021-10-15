package com.jumeirah.k8s.poc.hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SynixActionController {


    @GetMapping("/")
    public String doStuff(@RequestParam String name){

        return "hi jumeirah's  "+name+" folk";
    }
}
