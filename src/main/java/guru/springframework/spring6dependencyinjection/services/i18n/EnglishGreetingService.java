package guru.springframework.spring6dependencyinjection.services.i18n;

import guru.springframework.spring6dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
