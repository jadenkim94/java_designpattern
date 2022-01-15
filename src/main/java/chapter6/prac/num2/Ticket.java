package chapter6.prac.num2;

public class Ticket {

    private int serialNumber;

    public Ticket(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void getTicket(){
        if(serialNumber <= 0){
            System.out.println("유효하지 않은 티켓");
        } else{
            System.out.println(serialNumber++);
        }
    }
}
