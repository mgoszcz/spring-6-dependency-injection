package guru.springframework.spring6dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimary implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello From the primary Bean";
    }
}
