package chapter9.prac1;

import java.lang.ref.WeakReference;

public class Client {

    public static void main(String[] args) {
        Battery battery = new Battery();
        BatteryLevelDisplay display = new BatteryLevelDisplay(battery);
        LowBatteryWarning warning = new LowBatteryWarning(battery);

        WeakReference<BatteryLevelDisplay> weakDisplay = new WeakReference<>(display);

        battery.attachObserver(display);
        battery.attachObserver(warning);

        for(int i = 0; i < 10; i++){
            battery.consume(10);
        }
    }
}
