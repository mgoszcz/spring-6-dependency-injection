package guru.springframework.spring6dependencyinjection.controllers;

import guru.springframework.spring6dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // As we have property injection we have to mark it with Autowired as spring will not know what to do without it
    @Qualifier("propertyGreetingsService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
