package chapter11.after;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG 모터 구동");
    }
}
