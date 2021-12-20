package chapter9.prac2;

public class ElevatorDisplay implements Observer{

    private ElevatorController elevatorController;

    public ElevatorDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("ElevatorDisplay: " + elevatorController.getCurFloor());
    }
}
