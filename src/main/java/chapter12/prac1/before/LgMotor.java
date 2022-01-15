package chapter12.prac1.before;

public class LgMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG motor " + direction);
    }
}
