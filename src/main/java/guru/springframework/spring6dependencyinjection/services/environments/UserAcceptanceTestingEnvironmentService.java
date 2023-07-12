package guru.springframework.spring6dependencyinjection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("environmentService")
public class UserAcceptanceTestingEnvironmentService implements EnvironmentService {
    @Override
    public String printEnvironment() {
        return "UAT environment";
    }
}
