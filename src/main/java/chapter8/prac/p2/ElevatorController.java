package chapter8.prac.p2;

public class ElevatorController {
    private int id;
    private int currentFloor;

    public ElevatorController(int id) {
        this.id = id;
    }


    public void go(int destination) {
        currentFloor = destination;
        System.out.println("Elevator-"+ id + " 의 위치는: " + currentFloor );
    }
}
