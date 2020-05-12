package HelloWorld;

import HelloWorld.core.MessageQueueFactory;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.logback.shaded.checkerframework.checker.nullness.qual.NonNull;
import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @Valid
    @NonNull
    private MessageQueueFactory messageQueue = new MessageQueueFactory();

    @JsonProperty public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }

    @JsonProperty("messageQueue")
    public MessageQueueFactory getMessageQueueFactory() {
        return messageQueue;
    }

    @JsonProperty("messageQueue")
    public void setMessageQueueFactory(MessageQueueFactory factory) {
        this.messageQueue = factory;
    }
}
