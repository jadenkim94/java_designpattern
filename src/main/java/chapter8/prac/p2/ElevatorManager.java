package chapter8.prac.p2;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
    }

    public void addController(ElevatorController controller){
        controllers.add(controller);
    }

    public void requestElevator(int destination, Direction direction){
        int selectedElevator = selectElevator(destination, direction);

        controllers.get(selectedElevator).go(destination);
    }

    private int selectElevator(int destination, Direction direction) {
        return 0;
    }
}
