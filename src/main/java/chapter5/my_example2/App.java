package chapter5.my_example2;

import chapter5.my_example2.player.GeneralPlayer;
import chapter5.my_example2.player.PowerPlayer;
import chapter5.my_example2.player.SoccerPlayer;

public class App {
    public static void main(String[] args) {

        SoccerPlayer generalPlayer = new GeneralPlayer(SoccerPlayer.GENERAL);
        generalPlayer.shoot();

        SoccerPlayer powerPlayer = new PowerPlayer(SoccerPlayer.POWER);
        powerPlayer.shoot();

    }
}
