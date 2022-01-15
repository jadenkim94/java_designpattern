package chapter8.prac.p2;

public class DestinationSelectionCommand implements Command{

    private ElevatorController elevatorController;
    private int destination;

    public DestinationSelectionCommand(ElevatorController elevatorController, int destination) {
        this.elevatorController = elevatorController;
        this.destination = destination;
    }

    @Override
    public void execute() {
        elevatorController.go(destination);
    }
}
