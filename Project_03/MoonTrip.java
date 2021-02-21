import java.util.Scanner;
import java.text.DecimalFormat;
/**
*Prints out a description of a ticket based on user input.
*
*Project 3
*Alexander Brannon - COMP 1210 - 004
*9/21/17
*/
public class MoonTrip
{
/**
*Prints a description of a ticket.
*@param args Command line arguments - allows for user input.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      String code;
      String ticketCode;
      String date;
      String time;
      String seat;
      String itinerary;
      String price;
      char category;
      double cost;
      int prizeNumber;
      int e;
      int s;
      System.out.print("Enter ticket code: ");
      code = userInput.nextLine();
      ticketCode = code.trim();
      System.out.println("");
      
      int length = ticketCode.length();
      
      if (length >= 26)
      {
         date = ticketCode.substring(0, 2) + "/" 
            + ticketCode.substring(2, 4) + "/" 
            + ticketCode.substring(4, 8);
         System.out.print("Date: " + date);
      
         time = ticketCode.substring(8, 10) + ":" 
            + ticketCode.substring(10, 12);
         System.out.print("   Time: " + time);
      
         seat = ticketCode.substring(22, 25);
         System.out.println("   Seat: " + seat);
      
         itinerary = ticketCode.substring(25);
         System.out.println("Itinerary: " + itinerary);
      
         price = ticketCode.substring(13, 20) + "."
            + ticketCode.substring(20, 22);
         double price1 = Double.parseDouble(price);
         DecimalFormat method = new DecimalFormat("$#,##0.00");
         System.out.print("Price: " + method.format(price1));
      
         category = ticketCode.charAt(12);
         System.out.print("   Category: " + category);
         if (category == 's') {
            cost = price1 - price1 * .4;
         }
         else if (category == 'e') {
            cost = price1 - price1 * .2;
         }
         else {
            cost = price1;
         }
         System.out.println("   Cost: " + method.format(cost));
      
         prizeNumber = (int) (Math.random() * 9999 + 0001);
         DecimalFormat prize = new DecimalFormat("0000");
         System.out.println("Prize Number: " + prize.format(prizeNumber));
      }
      else {
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26"
            + " characters.");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
   
   
   
   
   }




}