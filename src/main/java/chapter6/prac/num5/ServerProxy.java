package chapter6.prac.num5;

public class ServerProxy implements Server {

    @Override
    public void doSomething() {
        System.out.println("실제 서버와 네트워크 연결");
    }
}
