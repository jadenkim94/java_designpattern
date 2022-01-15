package chapter8.prac.p1;

public class Client {

    public static void main(String[] args) {
        Tv tv = new Tv();
        TwoButtonController buttonController = new TwoButtonController();

        Command powerCommand = new PowerCommand(tv);

        buttonController.setCommand(powerCommand, powerCommand);

        buttonController.button1Pressed();
        buttonController.button2Pressed();
        buttonController.button1Pressed();
        buttonController.button2Pressed();

        System.out.println("========");
        Command muteCommand = new MuteCommand(tv);

        buttonController.setCommand(muteCommand, powerCommand);

        buttonController.button1Pressed();
        buttonController.button2Pressed();
        buttonController.button1Pressed();
        buttonController.button1Pressed();
        buttonController.button2Pressed();
        buttonController.button1Pressed();


    }

}
