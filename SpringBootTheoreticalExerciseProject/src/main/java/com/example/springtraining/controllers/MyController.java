package com.example.springtraining.controllers;

import com.example.springtraining.services.GreetingService;
import com.sun.source.doctree.SeeTree;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
