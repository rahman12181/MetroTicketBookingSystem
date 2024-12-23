import java.util.Scanner;
import java.util.HashMap;

public class BookTickets {

public void  BookTicket(){
   HashMap<String,Integer> putyourstation=new HashMap<>();
     putyourstation.put("Okhlavihar", 30); 
     putyourstation.put("jamia milya islamiya",50);
     putyourstation.put("sukhdev vihar",60);
     putyourstation.put("kalkaji mandir",40);
     putyourstation.put("nehru place",40);
     putyourstation.put("knowledge park 2",60);
     putyourstation.put("parichouk",50);
     putyourstation.put("noida sector 51",40);
     putyourstation.put("Okhla NSIC", 20);
     putyourstation.put("Jasola Vihar shaheen bagh",20);
     putyourstation.put("Kalandi Kunj",20);
     putyourstation.put("Okhla Bird Santuary",30);
     putyourstation.put("Botanical Garden",25);
     putyourstation.put("Noida Sectors52", 30);
     putyourstation.put("Noida Sectors51",25);
     putyourstation.put("Noida Sectors50",30);
     putyourstation.put("Noida sector76",30);
     putyourstation.put("Noida sector101",30);
     putyourstation.put("NOida sector81",40);

     
     System.out.println("book your tickets here");
     System.out.println("your source station is okhla vihar");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your destinstion");
     String destination=sc.nextLine();
    
   
     if (putyourstation.containsKey(destination)) {
        int station=putyourstation.get(destination);
            System.out.println("source-->Okhla vihar to- \b"+"your destination is-->"+destination+"\nyour Tickets charge:"+station);
     }
            else{
                System.out.println("sorry your station not found\ntry for another station");
                
            }

            System.out.println("How Much Tickets You Want To Book");
            
             if (true) {
                 System.out.println("1.tickets\n2.tickets\n3.tickets\n4.tickets\n5.tickets");
                 System.out.println("enter your number of tickets");
                 int numberofticket=sc.nextInt();
                 switch (numberofticket) {
                   
                    case 1:System.out.println("you are booking 1 tickets");
                   
                        break;
                    case 2:System.out.println("you are booking 2 tickets");
                    
                    break;
                    case 3:System.out.println("you are booking 3 tickets");
                    break;
                    case 4:System.out.println("you are booking 4 tickets");
                    break;
                    case 5:System.out.println("you are booking 5 tickets");
                    default:System.out.println("tickets limits crossing");
                        break;
                 }
                 int station=putyourstation.get(destination);
                 if (numberofticket>1) {
                    int totalamount=station* numberofticket;
                    System.out.println(" your total amount="+totalamount);

                   
                 }
                 UpiPayment upipayment=new UpiPayment();
                
                 while(true)
                 {   
                     System.out.println("payment your tickets Amount Through-->"+"\n*1.UPI PAYMENT"+"\n*2.credit card");
                     System.out.println("CHOOSE YOUR PAYMENT METHOD..");
                     int paymentmethod=sc.nextInt();
                     switch (paymentmethod) {
                         case 1:
                         upipayment.onlineUpiPayment();
                        
                         
                             return;
                     case 2:
                     System.out.println("your payment has been done via ->credit card ");
                     return;
                         default:
                         System.out.println("error(404) cheak your code");
                            return;
                     }
                 }
               
                }     

}
}
