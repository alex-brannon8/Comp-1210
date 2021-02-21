import java.util.Scanner;
/**
*Uses Spherocylinder.java in order to print the wanted output.
*
*Alexander Brannon - COMP 1210 - 004
*9/28/17
*/
public class SpherocylinderApp {
/**
*Uses Spherocylinder.java to print wnated output.
*@param args Command line arguments - allows for user input.
*/
   public static void main(String[] args) {
      String label;
      double radius;
      double cylinderHeight;
      Scanner userInput = new Scanner(System.in);
      
      
      System.out.println("Enter label, radius, and cylinder"
         + " height for a spherocylinder.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tradius: ");
      radius = userInput.nextDouble();
      if (radius < 0) {
         System.out.print("Error: radius must be non-negative.");
      
      }
      else {
         System.out.print("\tcylinder height: ");
         cylinderHeight = userInput.nextDouble();
         if (cylinderHeight < 0) {
            System.out.print("Error: cylinder height must be non-negative.");
         
         }
         else {
            Spherocylinder spheroCylinder1 = new Spherocylinder(label, 
               +radius, cylinderHeight);
            System.out.println("");
            System.out.print(spheroCylinder1);
         }
      }
   
   
   
   }





}