package chapter12.after_factorymethod;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;
    private ResponseTimeScheduler() {};

    public static ElevatorScheduler getInstance(){
        if(scheduler == null){
            scheduler = new ResponseTimeScheduler();
        }
        return scheduler;
    }

    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }

}
