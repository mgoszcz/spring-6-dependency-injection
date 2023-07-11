package guru.springframework.spring6dependencyinjection.controllers;

import guru.springframework.spring6dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

//The best for spring injection is constructor injected
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
