package chapter13.before_1.door;

public class LgDoor extends Door{

    @Override
    protected void doClose() {
        System.out.println("Close LG Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open LG Door");
    }
}
