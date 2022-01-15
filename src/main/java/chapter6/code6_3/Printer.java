package chapter6.code6_3;

public class Printer {
    private static Printer printer = new Printer();
    private int counter = 0;
    private Printer() {}

    public static Printer getPrinter(){
        return printer;
    }
    public void print(String str){
        counter++;
        System.out.println(str);
    }
}
