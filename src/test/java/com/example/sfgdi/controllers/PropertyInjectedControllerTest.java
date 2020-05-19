package com.example.sfgdi.controllers;

import com.example.sfgdi.services.PropertyInjectedImplService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    public PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new PropertyInjectedImplService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}