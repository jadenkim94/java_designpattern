package chapter5.my_example;

public class SoccerPlayer {

    public static final String GENERAL = "일반";
    public static final String POWER = "파워";
    public static final String TECHNICAL = "기술적";

    private String shootType;

    public SoccerPlayer(String shootType) {
        this.shootType = shootType;
    }

    public void shoot(){
        if(shootType.equals(GENERAL)){
            System.out.println("평범한 슈팅");
        } else if (shootType.equals(POWER)){
            System.out.println("파워 슈팅");
        } else if ( shootType.equals(TECHNICAL)){
            System.out.println("기술적인 슈팅");
        }
    };

}
