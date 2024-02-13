package cz.upce.fei.nnpia.controllers;

import cz.upce.fei.nnpia.services.GreetingService;
import cz.upce.fei.nnpia.services.GreetingServiceImp;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerInstance {


    public MyControllerInstance() {
        }

    public String sayHello(GreetingService greetingService){
        return greetingService.sayGreeting();
    }
}
