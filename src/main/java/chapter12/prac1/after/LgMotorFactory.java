package chapter12.prac1.after;

public class LgMotorFactory implements MotorFactory{

    @Override
    public Motor createMotor() {
        return new LgMotor();
    }
}
