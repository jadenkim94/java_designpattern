package chapter13.prac1;

public class PremiumNavigationFactory implements NavigationFactory {

    @Override
    public GPS createGPS() {
        return new ExpensiveGPS();
    }

    @Override
    public Map createMap() {
        return new LargeMap();
    }

    @Override
    public Screen createScreen() {
        return new HDScreen();
    }


    @Override
    public PathFinder createPathFinder() {
        return new FastPathFinder();
    }
}
