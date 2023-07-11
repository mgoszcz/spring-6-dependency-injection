package guru.springframework.spring6dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello Everyone from Base Service";
    }
}
