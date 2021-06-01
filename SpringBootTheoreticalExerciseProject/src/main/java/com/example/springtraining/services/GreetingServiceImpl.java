package com.example.springtraining.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello WORLD - DEFAULT";

    @Override
    public String sayGreeting() {
        return  HELLO_WORLD;
    }
}
