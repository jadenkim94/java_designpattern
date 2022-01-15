package chapter8.prac.p1;

public class MuteCommand implements Command{

    private Tv tv;

    public MuteCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mute();
    }
}
