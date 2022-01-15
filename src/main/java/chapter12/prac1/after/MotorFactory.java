package chapter12.prac1.after;

public interface MotorFactory {

    default Motor getMotor(){
        Motor motor = createMotor();
        return motor;
    }

    Motor createMotor();

}
