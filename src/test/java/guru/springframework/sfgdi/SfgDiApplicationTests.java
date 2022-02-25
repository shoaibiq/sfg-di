package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controller.PropertyInjectedController;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SfgDiApplicationTests {
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}
	@Test
	void getGreeting(){
		System.out.println(controller.getGreeting());
	}
}
