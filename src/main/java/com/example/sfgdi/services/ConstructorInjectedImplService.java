package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedImplService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
