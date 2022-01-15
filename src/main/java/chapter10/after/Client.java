package chapter10.after;

public class Client {

    public static void main(String[] args) {
        Display display = new RoadDisplay();
        display.draw();

        System.out.println("==");

        Display roadWithLane = new LaneDecorator(display);
        roadWithLane.draw();

        System.out.println("==");

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
    }

}
