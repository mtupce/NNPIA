package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerSetTest {

    @Test
    void sayHello() {
        MyControllerSet controller = new MyControllerSet();

        GreetingService service = new GreetingServiceImp();
        controller.SetService(service);

        System.out.println(controller.sayHello());
    }
}