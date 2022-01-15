package chapter11.after;

public class Client {

    public static void main(String[] args) {
        Door door = new Door();
        HyndaiMotor hyndaiMotor = new HyndaiMotor(door);
        hyndaiMotor.move(Direction.UP);
    }

}
