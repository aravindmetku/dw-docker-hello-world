package HelloWorld.core.bundle;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

interface MyConfiguredBundleConfig {
    String getBundleSpecificConfig();
}

public class MyConfiguredBundle implements ConfiguredBundle<MyConfiguredBundleConfig> {
    @Override
    public void run(MyConfiguredBundleConfig applicationConfig, Environment environment) {
        applicationConfig.getBundleSpecificConfig();
    }

    @Override
    public void initialize(Bootstrap<?> bootstrap) {

    }
}
