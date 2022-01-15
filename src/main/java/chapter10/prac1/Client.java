package chapter10.prac1;

public class Client {

    public static void main(String[] args) {
        EmailContent basicEmailContent = new BasicEmailContent("hi");
        System.out.println(basicEmailContent.getContent());

        EmailContent external = new ExternalEmailContentDecorator(basicEmailContent);
        System.out.println(external.getContent());

        EmailContent secureEmailContent = new SecureEmailContentDecorator(external);
        System.out.println(secureEmailContent.getContent());


    }

}
