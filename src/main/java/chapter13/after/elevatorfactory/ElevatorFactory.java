package chapter13.after.elevatorfactory;

import chapter13.after.door.Door;
import chapter13.after.motor.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
