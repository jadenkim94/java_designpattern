package chapter12.after_factorymethod;

public class ElevatorManagerWithResponseTImeScheduling extends ElevatorManager{

    public ElevatorManagerWithResponseTImeScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ResponseTimeScheduler.getInstance();
    }
}
