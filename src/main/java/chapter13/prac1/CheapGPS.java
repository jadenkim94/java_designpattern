package chapter13.prac1;

public class CheapGPS extends GPS{

    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with cheap GPS");
        return null;
    }
}
