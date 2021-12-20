package chapter9.prac1;

public class BatteryLevelDisplay implements Observer{

    private Battery battery;

    public BatteryLevelDisplay(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void update() {
        System.out.println("Level : " + battery.getLevel());
    }
}
