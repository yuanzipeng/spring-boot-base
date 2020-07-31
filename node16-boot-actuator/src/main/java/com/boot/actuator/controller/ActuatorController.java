package com.boot.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
    @RequestMapping("/actuator")
    public String actuator (){
        return "actuator" ;
    }
}
