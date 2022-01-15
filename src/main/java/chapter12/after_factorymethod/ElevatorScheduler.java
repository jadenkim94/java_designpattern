package chapter12.after_factorymethod;

public interface ElevatorScheduler {

    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);

}
