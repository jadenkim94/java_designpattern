package chapter9.prac2;

public class Client {

    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController();
        ElevatorDisplay elevatorDisplay = new ElevatorDisplay(elevatorController);
        FloorDisplay floorDisplay = new FloorDisplay(elevatorController);
        ControlRoomDisplay controlRoomDisplay = new ControlRoomDisplay(elevatorController);
        VoiceNotice voiceNotice = new VoiceNotice(elevatorController);

        elevatorController.setObserversInOrder(elevatorDisplay, voiceNotice, floorDisplay, controlRoomDisplay);

        elevatorController.gotoFloor(5);
        elevatorController.gotoFloor(10);
    }

}
