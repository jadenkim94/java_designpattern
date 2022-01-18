package chapter13.after.motor;

import chapter13.after.door.Door;

public abstract class Motor {

    private MotorStatus motorStatus;
    private Door door;

    public Motor(){
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(){  // templateMethodPattern
        if(getMotorStatus() == MotorStatus.MOVING){
            return;
        }
        getDoor().close();
        moveMotor();
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor();

    public void setDoor(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }
}
