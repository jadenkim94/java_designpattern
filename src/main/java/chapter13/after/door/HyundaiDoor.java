package chapter13.after.door;

public class HyundaiDoor extends Door {

    @Override
    protected void doClose() {
        System.out.println("Close Hyundai Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open Hyundai Door");
    }
}
