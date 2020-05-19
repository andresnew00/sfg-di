package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedImplService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
