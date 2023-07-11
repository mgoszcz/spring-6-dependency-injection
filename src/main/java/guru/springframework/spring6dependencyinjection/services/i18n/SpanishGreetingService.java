package guru.springframework.spring6dependencyinjection.services.i18n;

import guru.springframework.spring6dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hola Mundo - ES";
    }
}
