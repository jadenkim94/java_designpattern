package chapter5.parc.p5.after;

import chapter5.parc.p5.after.move.WalkingStrategy;

public class Client {

    public static void main(String[] args) {
        Field field = new Field();
        field.setMoveStrategy(new WalkingStrategy());
        new Runnig(field);
    }

}
