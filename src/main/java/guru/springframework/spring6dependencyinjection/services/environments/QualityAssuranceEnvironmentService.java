package guru.springframework.spring6dependencyinjection.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("environmentService")
public class QualityAssuranceEnvironmentService implements EnvironmentService {
    @Override
    public String printEnvironment() {
        return "QA environment";
    }
}
