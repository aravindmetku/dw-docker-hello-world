package HelloWorld.core.tasks;

import HelloWorld.core.MessageQueueClient;
import io.dropwizard.servlets.tasks.Task;

import javax.annotation.Nullable;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class ExampleTask extends Task {

    private MessageQueueClient messageQueueClient;

    public ExampleTask(MessageQueueClient messageQueueClient) {
        super("example");
        this.messageQueueClient = messageQueueClient;
    }

    @Override
    public void execute(Map<String, List<String>> map, PrintWriter printWriter) throws Exception {
        messageQueueClient.printOnTask();
    }
}
