package chapter5.my_example2.player;

public class PowerPlayer extends SoccerPlayer{

    public PowerPlayer(String shootType) {
        super(SoccerPlayer.POWER);
    }

    @Override
    public void shoot() {
        System.out.println("파워 슈팅");
    }
}
