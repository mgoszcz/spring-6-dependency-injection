package guru.springframework.spring6dependencyinjection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("environmentService")
public class DevelopmentEnvironmentService implements EnvironmentService {
    @Override
    public String printEnvironment() {
        return "Dev environment";
    }
}
