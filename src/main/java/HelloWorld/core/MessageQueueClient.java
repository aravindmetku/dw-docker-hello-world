package HelloWorld.core;

public class MessageQueueClient {
    private String host;
    private String port;

    public MessageQueueClient(String host, String port) {
        System.out.println("creating new message client");
        this.host = host;
        this.port = port;
    }

    public void printWhatIGot() {
        System.out.println("host = " + host + ", port = " + port);
    }

    public void close() {
        System.out.println("message queue shall be closed");
    }
}
