package chapter8.prac.p2;

public class ElevatorRequestCommand implements Command{
    private Direction direction;
    private int destination;

    private ElevatorManager manager;

    public ElevatorRequestCommand(Direction direction, int destination, ElevatorManager manager) {
        this.direction = direction;
        this.destination = destination;
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.requestElevator(destination, direction);
    }
}
