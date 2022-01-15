package chapter11.before;

public class LGMotor extends Motor{
    public LGMotor(Door door) {
        super(door);
    }

    private void moveLgMotor(Direction direction){
        // LG Motor 구동
    }

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();
        if(motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveLgMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
