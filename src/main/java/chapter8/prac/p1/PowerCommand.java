package chapter8.prac.p1;

public class PowerCommand implements Command{

    private Tv tv;

    public PowerCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
