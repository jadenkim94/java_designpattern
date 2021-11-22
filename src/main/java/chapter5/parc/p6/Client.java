package chapter5.parc.p6;

import chapter5.parc.p6.PrintStrategy.HD108ReceiptPrinter;

public class Client {

    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.add(new Item("item1", 10000));
        sale.add(new Item("item2", 20000));

        sale.printReceipt();
        sale.setPrinter(new HD108ReceiptPrinter());
        sale.printReceipt();
    }

}
