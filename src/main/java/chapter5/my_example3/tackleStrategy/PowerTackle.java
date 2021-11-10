package chapter5.my_example3.tackleStrategy;

public class PowerTackle implements TackleStrategy{

    @Override
    public void tackle() {
        System.out.println("파워태클");
    }
}
