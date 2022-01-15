package chapter12.after_with_singleton;

public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;
    private ThroughputScheduler() {}

    public static ElevatorScheduler getInstance(){
        if(scheduler == null) {
            scheduler = new ThroughputScheduler();
        }
        return scheduler;
    }

    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
