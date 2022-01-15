package chapter12.prac1.before;

public class HyndaiMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor" + direction);
    }
}
