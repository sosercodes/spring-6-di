package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private MyController myController;

	@Test
	void testAutowiredMyController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		System.out.println("Hello from testGetControllerFromContext!");
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
