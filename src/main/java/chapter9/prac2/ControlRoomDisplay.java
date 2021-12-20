package chapter9.prac2;

public class ControlRoomDisplay implements Observer{

    private ElevatorController elevatorController;

    public ControlRoomDisplay(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("ControlRoomDisplay: " + elevatorController.getCurFloor());
    }
}
