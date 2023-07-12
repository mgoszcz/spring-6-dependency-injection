package guru.springframework.spring6dependencyinjection.controllers.environments;

import guru.springframework.spring6dependencyinjection.services.environments.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return environmentService.printEnvironment();
    }
}
