package com.example.springtraining.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("languageService")
public class SpanishService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World - from the SPANISH service";
    }
}
