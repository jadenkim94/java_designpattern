package chapter5.parc.p6;

import chapter5.parc.p6.PrintStrategy.DummyPrinter;
import chapter5.parc.p6.PrintStrategy.PrinterStrategy;
import java.util.ArrayList;
import java.util.Iterator;

public class Sale {
    private ArrayList<Item> items = new ArrayList<>();
    private PrinterStrategy printer = new DummyPrinter();

    public void printReceipt(){
        Iterator<Item> itr = items.iterator();
        StringBuffer buf = new StringBuffer();
        while (itr.hasNext()){
            Item item = itr.next();
            buf.append(item.getName());
            buf.append(item.getPrice());
        }
        printer.print(buf.toString());
    }

    public void add(Item item) {
        items.add(item);
    }

    public void setPrinter(PrinterStrategy printer) {
        this.printer = printer;
    }
}
