package chapter10.prac1;

public class BasicEmailContent implements EmailContent{

    private String content;

    public BasicEmailContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
