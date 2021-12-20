package chapter9.prac2;

import java.util.Arrays;

public class ElevatorController extends Subject{

    private int curFloor = 1;

    public void gotoFloor(int destination){
        curFloor = destination;
        notifyObservers();
    }

    public int getCurFloor(){
        return this.curFloor;
    }

    public void setObserversInOrder(Observer... observers){
        Arrays.stream(observers).forEach(o -> {
            this.attach(o);
        });
    }

}
