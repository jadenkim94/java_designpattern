package chapter6.prac.num1;

public class Client {

    public static void main(String[] args) {
        Printer printer = Printer.getPrinter();
        System.out.println(printer.toString());
        Printer printer2 = Printer.getPrinter();
        System.out.println(printer2.toString());
    }

}
