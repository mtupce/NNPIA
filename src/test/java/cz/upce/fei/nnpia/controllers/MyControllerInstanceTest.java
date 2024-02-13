package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerInstanceTest {

    @Test
    void sayHello() {
        MyControllerInstance controller = new MyControllerInstance();

        GreetingService service = new GreetingServiceImp();

        System.out.println(controller.sayHello(service));
    }

}