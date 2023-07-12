package guru.springframework.spring6dependencyinjection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("environmentService")
public class ProductionEnvironmentService implements EnvironmentService {
    @Override
    public String printEnvironment() {
        return "Production environment";
    }
}
