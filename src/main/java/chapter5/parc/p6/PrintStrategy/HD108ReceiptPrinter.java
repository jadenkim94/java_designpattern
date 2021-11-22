package chapter5.parc.p6.PrintStrategy;

public class HD108ReceiptPrinter implements PrinterStrategy {

    @Override
    public void print(String target) {
        System.out.println("actual print logic");
    }
}
