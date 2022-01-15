package chapter12.prac2;

public class LimpState extends CarState {
    public static final int LIMP_MODE_MAX_SPEED = 60;
    public LimpState(Car car) {
        super(car);
    }

    @Override
    public void speedUp(int targetSpeed) {
        System.out.println("Speed: " + car.getSpeed());
        if(targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED){
            car.setSpeed(targetSpeed);
        }
        System.out.println(" ==> " + car.getSpeed());
    }

    @Override
    public void engineFailedDetected() {

    }

    @Override
    public void engineRepaired() {
        car.setState(car.getNormalState());
    }
}
