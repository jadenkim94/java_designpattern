package chapter13.prac1;

public class ExpensiveGPS extends GPS{

    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with expensive GPS");
        return null;
    }
}
