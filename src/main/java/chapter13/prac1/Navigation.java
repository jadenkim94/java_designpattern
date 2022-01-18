package chapter13.prac1;

public class Navigation {
    private GPS gps;
    private Screen screen;
    private Map map;
    private PathFinder pathFinder;

    public Navigation(GPS gps, Screen screen, Map map, PathFinder pathFinder) {
        this.gps = gps;
        this.screen = screen;
        this.map = map;
        this.pathFinder = pathFinder;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public PathFinder getPathFinder() {
        return pathFinder;
    }

    public void setPathFinder(PathFinder pathFinder) {
        this.pathFinder = pathFinder;
    }
}
