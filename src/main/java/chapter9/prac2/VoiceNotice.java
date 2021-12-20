package chapter9.prac2;

public class VoiceNotice implements Observer{

    private ElevatorController elevatorController;

    public VoiceNotice(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    @Override
    public void update() {
        System.out.println("VoiceNotice : " + elevatorController.getCurFloor());
    }
}
