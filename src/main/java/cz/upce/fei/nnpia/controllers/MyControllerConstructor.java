package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;

public class MyControllerConstructor {
    private final GreetingService greetingService;

    public MyControllerConstructor(GreetingService service) {
        this.greetingService = service;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
