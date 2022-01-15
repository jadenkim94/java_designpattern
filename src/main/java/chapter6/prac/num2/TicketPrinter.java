package chapter6.prac.num2;

public class TicketPrinter {
    private static volatile TicketPrinter ticketPrinter;
    private int limit;
    private int ticketNumber = 0;

    private TicketPrinter() {}

    public static TicketPrinter getTicketPrinter(){
        if(ticketPrinter == null){
            synchronized (TicketPrinter.class){
                if(ticketPrinter == null){
                    ticketPrinter = new TicketPrinter();
                }
            }
        }
        return ticketPrinter;
    }

    public synchronized void setLimit(int limit){
        this.limit = limit;
    }

    public synchronized Ticket getTicket() throws Exception {
        if(this.ticketNumber < this.limit) {
            return new Ticket(++this.ticketNumber);
        } else {
            throw new Exception("더 이상 티켓을 발행할 수 없습니다.");
        }
    }



}
