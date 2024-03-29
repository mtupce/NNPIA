package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerConstructorTest {

    MyControllerConstructor controller;

    @BeforeEach
    void setUp(){
        GreetingService service = new GreetingServiceImp();
        controller = new MyControllerConstructor(service);
    }

    @Test
    void sayHello(){



        System.out.println(controller.sayHello());
    }

}