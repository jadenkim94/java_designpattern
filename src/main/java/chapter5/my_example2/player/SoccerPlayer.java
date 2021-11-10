package chapter5.my_example2.player;

public abstract class SoccerPlayer {
    public static final String GENERAL = "일반";
    public static final String POWER = "파워";
    public static final String TECHNICAL = "기술적";

    private String shootType;

    public SoccerPlayer(String shootType) {
        this.shootType = shootType;
    }

    public void shoot(){};
}
