package chapter12.prac1.after;

public class HyndaiMotorFactory implements MotorFactory{

    @Override
    public Motor createMotor() {
        return new HyndaiMotor();
    }
}
