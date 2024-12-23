import java.util.Scanner;

public class OnlineMetroTicketsBooking {
    
    public static void main(String[] args) {
        OnlineMetroTicketsBooking booktickets=new OnlineMetroTicketsBooking();
        BookTickets classbook=new BookTickets();
        UpiPayment upipayment=new UpiPayment();
        Scanner s=new Scanner(System.in);
        System.out.println("<---Tickets screen--->");
        while (true) {
           // System.out.println("Enter your source");
           // System.out.println("Enter your destination");
            System.out.println("1.Book Tickets");
            System.out.println("2.Exit");
            System.out.println("chose your option");
            int option=s.nextInt();
            switch(option){
                case 1:
                classbook.BookTicket();
                System.out.println("Booked tickets successully\n");
                break;
                case 2:
                System.out.println("exited");
                return;
                default:
                System.out.println("error(404) page not found");
            }
        }
    }
}
