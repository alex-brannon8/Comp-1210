/**
*Based on user's input in ounces, this program converts it to 
*various other measurements which cannot exceed one billion ounces.
*
*Project 2
*Alexander Brannon - COMP 1210 - 001
*9/12/2017
*/
import java.util.Scanner;
/**
*Allows for user input.
*/
public class LiquidMeasures
{
/**
*Converts ounces to other measurements not exceeding one billion ounces.
*@param args Command line argument - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ounces = 0;
      int quarts;
      int gallons;
      int barrels;
      int remainingOunces1;
      int remainingOunces2;
      int remainingOunces3;
   //Ask the user for the amount of liquid in ounces.
      System.out.print("Enter amount of liquid in ounces: ");
      ounces = userInput.nextInt();
      if (ounces < 100000000) { 
         
         System.out.println("Measures by volume:");
         
         barrels = ounces / 5376;
         remainingOunces1 = ounces - barrels * 5376;
         System.out.println("\tBarrels: " + barrels);
         
         gallons = remainingOunces1 / 128;
         remainingOunces2 = remainingOunces1 - gallons * 128;
         System.out.println("\tGallons: " + gallons);
         
         quarts = remainingOunces2 / 32;
         remainingOunces3 = remainingOunces2 - quarts * 32;
         System.out.println("\tQuarts: " + quarts);
         
         System.out.println("\tOunces: " + remainingOunces3);
         
         System.out.print(ounces + " oz = ");  
         System.out.print("(" + barrels + " bl * 5376 oz) ");   
         System.out.print("+ (" + gallons + " gal * 128 oz) ");  
         System.out.print("+ (" + quarts + " qt * 32 oz) ");
         System.out.print("+ (" + remainingOunces3 + " oz) ");  
      } 
      else {
         System.out.print("Amount must not exceed 1,000,000,000.");      
      
      }
      
      
      
   
   }

}