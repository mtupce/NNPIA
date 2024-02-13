package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerSetTest {

    @Autowired
    MyControllerSet controller = new MyControllerSet();

    @Test
    void sayHello() {

        GreetingService service = new GreetingServiceImp();
        controller.SetService(service);

        System.out.println(controller.sayHello());
    }
}