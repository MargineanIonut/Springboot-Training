package com.example.springtraining.controllers;

import com.example.springtraining.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingService greetingService;

    public I18NController(@Qualifier("languageService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
       return greetingService.sayGreeting();
    }
}
