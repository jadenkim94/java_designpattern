package chapter13.before_1.door;

public abstract class Door {
    private DoorStatus doorStatus;

    public Door(){
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void close(){
        if(doorStatus == DoorStatus.CLOSED){
            return;
        }
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open(){
        if(doorStatus == DoorStatus.OPEN){
            return;
        }
        doOpen();
        doorStatus = DoorStatus.OPEN;
    }

    protected abstract void doOpen();
}
