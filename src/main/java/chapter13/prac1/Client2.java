package chapter13.prac1;

public class Client2 {

    public static void main(String[] args) {
        NavigationFactory factory = new PremiumNavigationFactory();
        GPS gps = factory.createGPS();
        Screen screen = factory.createScreen();
        PathFinder pathFinder = factory.createPathFinder();
        Map map = factory.createMap();

        screen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }

}
