package chapter5.my_example2.player;

public class GeneralPlayer extends SoccerPlayer{

    public GeneralPlayer(String shootType) {
        super(SoccerPlayer.GENERAL);
    }

    @Override
    public void shoot() {
        System.out.println("일반 슈팅");
    }
}
