package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"DEV", "default"})
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "DEV";
    }
}
