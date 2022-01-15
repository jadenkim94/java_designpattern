package chapter12.prac1.before;

public class Client {

    public static void main(String[] args) {
        Motor lgMotor = new LgMotor();
        ElevatorController controller1 = new ElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyndaiMotor = new HyndaiMotor();
        ElevatorController controller2 = new ElevatorController(2, hyndaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }

}
