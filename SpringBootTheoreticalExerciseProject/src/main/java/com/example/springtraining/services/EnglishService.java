package com.example.springtraining.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("languageService")
public class EnglishService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World - from the ENGLISH service";
    }
}
