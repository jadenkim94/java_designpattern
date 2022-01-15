package chapter5.my_example3;

import chapter5.my_example3.shootStrategy.GeneralShoot;
import chapter5.my_example3.shootStrategy.PowerShoot;
import chapter5.my_example3.tackleStrategy.PowerTackle;

public class Client {

    public static void main(String[] args) {
        Player player = new Player(new GeneralShoot(), new PowerTackle());
        player.shoot();
        player.tackle();

        player.setShootStrategy(new PowerShoot());
        player.shoot();
    }

}
