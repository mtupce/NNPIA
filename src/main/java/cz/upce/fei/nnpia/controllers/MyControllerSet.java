package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerSet {

    private GreetingService greetingService;

    public MyControllerSet() {

    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void SetService(GreetingService service){
        this.greetingService = service;
    }
}
