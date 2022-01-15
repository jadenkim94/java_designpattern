package chapter10.before;

public class Client {

    public static void main(String[] args) {
        RoadDisplay display = new RoadDisplay();
        display.draw();

        RoadDisplayWithLane roadDisplayWithLane = new RoadDisplayWithLane();
        roadDisplayWithLane.draw();
    }

}
