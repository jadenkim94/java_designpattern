package chapter13.prac1;

public class BasicNavigationFactory implements NavigationFactory {


    @Override
    public GPS createGPS() {
        return new CheapGPS();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }


    @Override
    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }
}
