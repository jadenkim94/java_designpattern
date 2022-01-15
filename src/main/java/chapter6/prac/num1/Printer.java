package chapter6.prac.num1;

public class Printer {
    private Printer() {}

    private static class PrinterHolder{
        private static final Printer PRINTER = new Printer();
    }

    public static Printer getPrinter(){
        return PrinterHolder.PRINTER;
    }

    public void doSomething(String str){
        System.out.println(str);
    }
}
