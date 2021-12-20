package chapter9.prac2;

public class FloorDisplay implements Observer{

    private ElevatorController elevatorController;

    public FloorDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("FloorDisplay : " + elevatorController.getCurFloor());
    }
}
