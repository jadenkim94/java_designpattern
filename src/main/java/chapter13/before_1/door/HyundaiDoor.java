package chapter13.before_1.door;

public class HyundaiDoor extends Door{

    @Override
    protected void doClose() {
        System.out.println("Close Hyundai Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open Hyundai Door");
    }
}
