package chapter13.prac1;

public class SlowPathFinder extends PathFinder{

    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}
