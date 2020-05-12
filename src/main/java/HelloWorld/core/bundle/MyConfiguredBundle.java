package HelloWorld.core.bundle;

import HelloWorld.HelloWorldConfiguration;
import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyConfiguredBundle implements ConfiguredBundle<HelloWorldConfiguration> {
    @Override
    public void run(HelloWorldConfiguration applicationConfig, Environment environment) {
        System.out.println("running my config bundle: " + applicationConfig.getDefaultName());
    }

    @Override
    public void initialize(Bootstrap<?> bootstrap) {
        System.out.println("Myconfig bundle is intiated");
    }
}
