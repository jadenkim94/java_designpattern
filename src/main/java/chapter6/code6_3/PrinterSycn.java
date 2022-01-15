package chapter6.code6_3;

public class PrinterSycn {
    private static PrinterSycn printer = null;
    private PrinterSycn (){}

    public synchronized static PrinterSycn getPrinter(){
        if(printer == null){
            printer = new PrinterSycn();
        }
        return printer;
    }

    public void print(String str){
        System.out.println(str);
    }

}
