package guru.springframework.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello Everyone from Base Service";
    }
}
