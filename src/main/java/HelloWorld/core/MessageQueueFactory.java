package HelloWorld.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.lifecycle.Managed;
import io.dropwizard.setup.Environment;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class MessageQueueFactory {

    @NotEmpty
    private String host;

    @Min(1)
    private String port;

    @JsonProperty
    public String getHost() {
        return host;
    }

    @JsonProperty
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty
    public String getPort() {
        return port;
    }

    @JsonProperty
    public void setPort(String port) {
        this.port = port;
    }

    public MessageQueueClient build(Environment environment) {
        MessageQueueClient messageQueueClient = new MessageQueueClient(host, port);
        environment.lifecycle().manage(new Managed() {
            @Override
            public void start() throws Exception {

            }

            @Override
            public void stop() throws Exception {
                messageQueueClient.close();
            }
        });
        return messageQueueClient;
    }
}
