package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnvironmentControllerTest {
    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}