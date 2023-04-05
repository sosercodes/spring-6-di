package guru.springframework.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from GreetingServiceImpl!";
    }
}
