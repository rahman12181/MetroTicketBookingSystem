import java.util.Scanner;

public class UpiPayment {
     
  public void onlineUpiPayment(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your UPI-ID");
    String upi_id=s.nextLine();

    if (!upi_id.contains("@")) {
        System.out.println("Invalid upi-id,Try again..");
        return;
    }
     System.out.println("Enter totalamount of tickets to pay..");
     int totalamount=s.nextInt();

     if(totalamount<=0)
     {
        System.out.println("Invalid Amount\n");
        return;
     }
     String phonePaypwd="rahman__12181";
     s.nextLine();

     while(true) {
     
      System.out.println("Enter your UPI-PIN");
      String upiPin=s.nextLine();

     if (upiPin.equals(phonePaypwd)) {
      System.out.println("\nProcessing payment...");
      try {
          Thread.sleep(4000); // Simulating processing time
          System.out.println("PayMent Successful");
          System.out.println("your UPI payment has been done through phone pay\n");
          YourTickets tickets=new YourTickets();
          tickets.yourtickets();
          break;
      } catch (InterruptedException e) {
          System.out.println("Error in processing payment.");
      }

     }
     else if (!upiPin.equals(phonePaypwd)) {
      System.out.println("Incorrect UPI-PIN"+"\nTry again");
      
     }
     else{
      System.out.println("correct result not found...");
     }
     
     } 
    
  }

}
