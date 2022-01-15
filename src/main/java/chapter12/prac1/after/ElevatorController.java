package chapter12.prac1.after;

public class ElevatorController {
    private int id;
    private int curFloor;
    private MotorFactory motorFactory;

    public ElevatorController(int id, MotorFactory motorFactory) {
        this.id = id;
        this.motorFactory = motorFactory;
    }

    public void gotoFloor(int destination){
        if(destination == curFloor){
            return;
        }

        Direction direction;

        if(destination > curFloor){
            direction = Direction.UP;
        } else {
            direction = Direction.DOWN;
        }

        Motor motor = motorFactory.createMotor();
        motor.move(direction);

        System.out.println("Elevator [" + id +"] Floor: " + curFloor);
        curFloor = destination;
        System.out.println("==> " + curFloor + " with " + motorFactory.getClass().getName());

        motor.stop();
    }
}
