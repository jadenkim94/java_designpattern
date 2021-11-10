package chapter5.my_example;

public class App {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer(SoccerPlayer.GENERAL);
        soccerPlayer.shoot();
        SoccerPlayer soccerPlayer2 = new SoccerPlayer(SoccerPlayer.POWER);
        soccerPlayer2.shoot();
    }
}
