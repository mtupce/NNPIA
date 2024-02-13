package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerPropertyTest {

    MyControllerProperty controller;

    @BeforeEach
    void setUp() {
        controller = new MyControllerProperty();
        controller.greetingService = new GreetingServiceImp();
    }

    @Test
    void sayHello() {

        System.out.println(controller.sayHello());
    }
}