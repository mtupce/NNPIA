package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerProperty {

    @Autowired
    public GreetingService greetingService;
    public MyControllerProperty() {
        }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
