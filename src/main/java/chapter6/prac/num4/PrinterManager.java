package chapter6.prac.num4;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager {

    private List<Printer> printers = new ArrayList<>();
    private int printNum = 3;

    private PrinterManager() {
        for (int i = 0; i < printNum; i++) {
            printers.add(new Printer());
        }
    }

    public static class PrinterManagerHolder {
        private static final PrinterManager PRINTERMANAGER = new PrinterManager();
    }

    public static PrinterManager getPrinterManager() {
        return PrinterManagerHolder.PRINTERMANAGER;
    }

    public synchronized Printer getPrinter() {
        while (true) {
            for (Printer printer : printers) {
                if (printer.isAvailable()) {
                    printer.setAvailable(false);
                    return printer;
                }
            }
        }
    }

}
