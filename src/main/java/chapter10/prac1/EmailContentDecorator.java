package chapter10.prac1;

public class EmailContentDecorator implements EmailContent {

    private EmailContent emailContent;

    public EmailContentDecorator(EmailContent emailContent) {
        this.emailContent = emailContent;
    }

    @Override
    public String getContent() {
        return emailContent.getContent();
    }
}
