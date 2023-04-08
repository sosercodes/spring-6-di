package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from GreetingServiceSetterInjected!";
    }
}
