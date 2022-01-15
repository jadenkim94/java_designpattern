package chapter12.after_with_singleton;

public class Client {

    public static void main(String[] args) {
        ElevatorManager emWithResponseTImeScheduler = new ElevatorManager(2, SchedulingStrategyId.RESPONSE_TIME);
        emWithResponseTImeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyId.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyId.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }

}
