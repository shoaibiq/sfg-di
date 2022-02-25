package guru.springframework.sfgdi.Controller;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
