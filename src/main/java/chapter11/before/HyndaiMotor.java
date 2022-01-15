package chapter11.before;

public class HyndaiMotor extends Motor {
    public HyndaiMotor(Door door) {
        super(door);
    }

    private void moveHyndaiMotor(Direction direction){
        // Hyndai Motor 구동
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

        moveHyndaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
