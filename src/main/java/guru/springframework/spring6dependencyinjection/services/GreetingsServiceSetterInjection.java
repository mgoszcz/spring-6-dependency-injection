package guru.springframework.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingsServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hi I am Setting a Greeting";
    }
}
