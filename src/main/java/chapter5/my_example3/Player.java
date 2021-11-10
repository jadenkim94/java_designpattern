package chapter5.my_example3;

import chapter5.my_example3.shootStrategy.ShootStrategy;
import chapter5.my_example3.tackleStrategy.TackleStrategy;

public class Player {

    private ShootStrategy shootStrategy;
    private TackleStrategy tackleStrategy;

    public Player(ShootStrategy shootStrategy, TackleStrategy tackleStrategy) {
        this.shootStrategy = shootStrategy;
        this.tackleStrategy = tackleStrategy;
    }

    public void shoot(){
        shootStrategy.shoot();
    }

    public void tackle(){
        tackleStrategy.tackle();
    }

    public void setShootStrategy(ShootStrategy shootStrategy) {
        this.shootStrategy = shootStrategy;
    }

    public void setTackleStrategy(TackleStrategy tackleStrategy) {
        this.tackleStrategy = tackleStrategy;
    }
}
