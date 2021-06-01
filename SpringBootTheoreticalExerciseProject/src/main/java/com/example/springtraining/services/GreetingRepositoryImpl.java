package com.example.springtraining.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary ENGLISH Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Primary SPANISH Greeting Service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - Primary GERMAN Greeting Service";
    }
}
