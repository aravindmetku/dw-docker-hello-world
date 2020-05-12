package HelloWorld.resources;

import HelloWorld.api.Saying;
import com.codahale.metrics.annotation.Timed;
import io.dropwizard.jersey.params.NonEmptyStringParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") NonEmptyStringParam name) {
        final String value = name.get().orElse("");
        return new Saying(counter.incrementAndGet(), value);
    }
}
