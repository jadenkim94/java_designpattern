package chapter13.before_1;

import chapter13.before_1.door.Door;
import chapter13.before_1.door.DoorFactory;
import chapter13.before_1.motor.Motor;
import chapter13.before_1.motor.MotorFactory;

public class Client {

    public static void main(String[] args) {
        Door lgDoor = DoorFactory.createDoor(VendorId.LG);
        Motor lgMotor = MotorFactory.createMotor(VendorId.LG);
        lgMotor.setDoor(lgDoor);

        lgDoor.open();
        lgMotor.move();

        // Hyundai 부품으로 교체

        Door hyundaiDoor = DoorFactory.createDoor(VendorId.HYUNDAI);
        Motor hyundaiMotor = MotorFactory.createMotor(VendorId.HYUNDAI);
        hyundaiMotor.setDoor(hyundaiDoor);

        hyundaiDoor.open();
        hyundaiMotor.move();

    }
}
