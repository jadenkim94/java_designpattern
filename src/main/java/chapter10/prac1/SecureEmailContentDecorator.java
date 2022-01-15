package chapter10.prac1;

public class SecureEmailContentDecorator extends EmailContentDecorator {

    public SecureEmailContentDecorator(EmailContent emailContent) {
        super(emailContent);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        return encrypt(content);
    }

    private String encrypt(String content) {
        return content + " Encrypted";
    }
}
