package chapter13.after.elevatorfactory;

import chapter13.after.door.Door;
import chapter13.after.door.LgDoor;
import chapter13.after.motor.LGMotor;
import chapter13.after.motor.Motor;

public class LgElevatorFactory extends ElevatorFactory {

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LgDoor();
    }
}
