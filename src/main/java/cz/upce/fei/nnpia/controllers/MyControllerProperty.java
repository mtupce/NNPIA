package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;

public class MyControllerProperty {

    public GreetingService greetingService;
    public MyControllerProperty() {
        }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
