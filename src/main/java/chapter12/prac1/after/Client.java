package chapter12.prac1.after;

public class Client {

    public static void main(String[] args) {
        MotorFactory lgMotorFactory = new LgMotorFactory();
        ElevatorController controller1 = new ElevatorController(1, lgMotorFactory);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        MotorFactory hyndaiMotorFactory = new HyndaiMotorFactory();
        ElevatorController controller2 = new ElevatorController(2, hyndaiMotorFactory);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }

}
