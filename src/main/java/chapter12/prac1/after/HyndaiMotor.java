package chapter12.prac1.after;

public class HyndaiMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor" + direction);
    }
}
