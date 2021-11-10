package chapter5.my_example3.tackleStrategy;

public class GeneralTackle implements TackleStrategy{

    @Override
    public void tackle() {
        System.out.println("약한태클");
    }
}
