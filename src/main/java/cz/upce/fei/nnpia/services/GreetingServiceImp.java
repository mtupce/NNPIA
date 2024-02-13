package cz.upce.fei.nnpia.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Greetings";
    }
}
