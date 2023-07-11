package guru.springframework.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

// Bean custom name
@Service("propertyGreetingsService")
public class GreetingsServicePropertyInjected implements  GreetingService{
    @Override
    public String sayGreetings() {
        return "Friends don't let friends to property injection";
    }
}
