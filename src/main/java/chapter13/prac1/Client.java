package chapter13.prac1;

public class Client {

    public static void main(String[] args) {
        GPS gps = new CheapGPS();
        Screen mapScreen = new SDScreen();
        PathFinder pathFinder = new SlowPathFinder();

        Map map = new SmallMap();
        mapScreen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }

}
