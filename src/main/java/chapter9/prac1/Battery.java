package chapter9.prac1;

import java.util.ArrayList;
import java.util.List;

public class Battery {

    private int level = 100;
    private List<Observer> observers;

    public void attachObserver(Observer observer){
        if(this.observers == null){
            observers = new ArrayList<>();
        }
        this.observers.add(observer);
    }

    public void detachObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void consume(int amount){
        this.level -= amount;
        observers.forEach(o -> o.update());
    }

    public int getLevel() {
        return this.level;
    }
}
