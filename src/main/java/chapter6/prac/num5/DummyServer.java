package chapter6.prac.num5;

public class DummyServer implements Server{

    @Override
    public void doSomething() {
        System.out.println("doing dummy stuff");
    }

    public String getResult() {
        return "invoked";
    }
}
