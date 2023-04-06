package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;
    String sayHello() {
        return greetingService.sayHello();
    }
}
