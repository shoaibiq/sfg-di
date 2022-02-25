package guru.springframework.sfgdi.Controller;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
