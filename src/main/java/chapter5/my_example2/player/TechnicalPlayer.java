package chapter5.my_example2.player;

public class TechnicalPlayer extends SoccerPlayer{

    public TechnicalPlayer(String shootType) {
        super(SoccerPlayer.TECHNICAL);
    }

    @Override
    public void shoot() {
        System.out.println("기술적인 슈팅");
    }
}
