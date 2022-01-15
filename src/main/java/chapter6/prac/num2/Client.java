package chapter6.prac.num2;

public class Client {

    public static void main(String[] args) {
        TicketPrinter ticketPrinter = TicketPrinter.getTicketPrinter();
        ticketPrinter.setLimit(5);

        try {
            while (true){
                Ticket ticket = ticketPrinter.getTicket();
                System.out.println(ticket);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
