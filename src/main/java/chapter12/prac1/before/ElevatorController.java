package chapter12.prac1.before;

public class ElevatorController {
    private int id;
    private int curFloor;
    private Motor motor;

    public ElevatorController(int id, Motor motor) {
        this.id = id;
        this.motor = motor;
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

        motor.moveMotor(direction);

        System.out.println("Elevator [" + id +"] Floor: " + curFloor);
        curFloor = destination;
        System.out.println("==> " + curFloor + " with " + motor.getClass().getName());

        motor.stop();
    }
}
