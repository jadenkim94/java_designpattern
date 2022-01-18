package chapter13.prac1;

public class TestNavigationFactory implements NavigationFactory {

    @Override
    public GPS createGPS() {
        return new GPSSimulator();
    }

    @Override
    public Map createMap() {
        return new TestMap();
    }

    @Override
    public Screen createScreen() {
        return new TestScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new TestPathFinder();
    }
}
