package chapter13.after;

import chapter13.after.door.Door;
import chapter13.after.elevatorfactory.ElevatorFactory;
import chapter13.after.elevatorfactory.ElevatorFactoryFactory;
import chapter13.after.elevatorfactory.HyundaiElevatorFactory;
import chapter13.after.elevatorfactory.LgElevatorFactory;
import chapter13.after.motor.Motor;
import chapter13.before_1.door.DoorFactory;
import chapter13.before_1.motor.MotorFactory;

public class Client {
    public static void main(String[] args) {
        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorId.LG);
        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move();
    }
}
