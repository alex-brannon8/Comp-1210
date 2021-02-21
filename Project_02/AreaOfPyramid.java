/**
*Calculates and prints the area of a 
pyramid with the guidelines given by the user.
*
*Project 2
*Alexander Brannon - COMP 1210 - 001
*9/9/2017
*/
import java.util.Scanner;
/**
*Allows for user input.
*/
public class AreaOfPyramid
{
/**
*Calculates the area of a pyramid.
*@param args Command line argument - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      double baseLength = 0;
      double slantHeight = 0;
   //Ask the user for the base length and slant height:
      System.out.println("Enter values for base and "
         + "slant height of a pyramid:");
      System.out.print("\tbase = ");
      baseLength = userInput.nextDouble();
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
   //Calculates the area based on given length and height.
      double area = baseLength * baseLength 
         + 4 * ((baseLength * slantHeight) / 2);
      System.out.println("");
      System.out.println("A pyramid with base = " 
         + baseLength + " and slant height = " 
         + slantHeight + "");
      System.out.print("has an area of "
         + area + " square units.");
   }
}