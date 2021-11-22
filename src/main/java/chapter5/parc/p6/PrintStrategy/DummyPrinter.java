package chapter5.parc.p6.PrintStrategy;

public class DummyPrinter implements PrinterStrategy {

    @Override
    public void print(String target) {
        System.out.println(target);
    }
}
