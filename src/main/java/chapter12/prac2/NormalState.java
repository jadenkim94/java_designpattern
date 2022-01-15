package chapter12.prac2;

public class NormalState extends CarState {
    public NormalState(Car car) {
        super(car);
    }

    @Override
    public void speedUp(int targetSpeed) {
        System.out.println("Speed: " + car.getSpeed());
        if(targetSpeed > car.getSpeed()){
            car.setSpeed(targetSpeed);
        }
        System.out.println(" ==> " + car.getSpeed());
    }

    @Override
    public void engineFailedDetected() {
        System.out.println("Speed: " + car.getSpeed());
        car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
        System.out.println(" ==> " + car.getSpeed());
        car.setState(car.getLimpMode());
    }

    @Override
    public void engineRepaired() {
        System.out.println("Unexpected Event");
    }
}
