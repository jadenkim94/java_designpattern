package chapter10.prac1;

public class ExternalEmailContentDecorator extends EmailContentDecorator{

    public ExternalEmailContentDecorator(EmailContent emailContent) {
        super(emailContent);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        return addDisclaimer(content);
    }

    private String addDisclaimer(String content) {
        return content + " Company Disclaimer";
    }
}
