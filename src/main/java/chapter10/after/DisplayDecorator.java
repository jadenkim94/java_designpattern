package chapter10.after;

public class DisplayDecorator extends Display{

    private Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }

    @Override
    public void draw() {
        display.draw();
    }
}
