package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;

public class MyControllerInstance {


    public MyControllerInstance() {
        }

    public String sayHello(GreetingService greetingService){
        return greetingService.sayGreeting();
    }
}
