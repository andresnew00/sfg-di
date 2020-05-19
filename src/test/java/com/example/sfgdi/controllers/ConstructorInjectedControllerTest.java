package com.example.sfgdi.controllers;

import com.example.sfgdi.services.PropertyInjectedImplService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PropertyInjectedImplService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}