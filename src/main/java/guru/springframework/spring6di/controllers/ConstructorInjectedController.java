package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayHello();
    }
}
