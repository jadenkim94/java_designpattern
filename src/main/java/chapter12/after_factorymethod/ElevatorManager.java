package chapter12.after_factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for(int i = 0; i < controllerCount; i++){
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
    }

    protected abstract ElevatorScheduler getScheduler();

    void requestElevator(int destination, Direction direction){
        ElevatorScheduler scheduler = getScheduler();
        System.out.println(scheduler);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).goToFloor(destination);
    }
}
