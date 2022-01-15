package chapter8.prac.p2;

public class Client {

    public static void main(String[] args) {
        ElevatorController controller1 = new ElevatorController(1);
        ElevatorController controller2 = new ElevatorController(2);

        ElevatorManager em = new ElevatorManager(2);
        em.addController(controller1);
        em.addController(controller2);

        Command destinationCommand1stController = new DestinationSelectionCommand(controller1, 1);
        ElevatorButton destinationButton1stFloor = new ElevatorButton(destinationCommand1stController);
        destinationButton1stFloor.pressed();

        Command destinationCommand2ndController = new DestinationSelectionCommand(controller2, 2);
        ElevatorButton destinationButton2stFloor = new ElevatorButton(destinationCommand2ndController);
        destinationButton2stFloor.pressed();

        Command requestDownCommand = new ElevatorRequestCommand(Direction.DOWN, 2, em);
        ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(requestDownCommand);
        requestDownFloorButton2ndFloor.pressed();

    }

}
