package HelloWorld.api;

public class Saying {
    private long id;
    private String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Saying() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
