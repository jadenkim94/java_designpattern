package chapter11.after;

public class HyndaiMotor extends Motor {
    public HyndaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Hyndai motor 구동");
    }
}
