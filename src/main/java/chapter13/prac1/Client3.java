package chapter13.prac1;

public class Client3 {
    public static void main(String[] args) {
        NavigationFactory basicNavigationFactory = new BasicNavigationFactory();
        NavigationFactory testFactory = new TestNavigationFactory();

        GPS gps = testFactory.createGPS();
        Screen screen = testFactory.createScreen();
        PathFinder pathFinder = basicNavigationFactory.createPathFinder();
        Map map = testFactory.createMap();

        screen.drawMap(map);
        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }

}
