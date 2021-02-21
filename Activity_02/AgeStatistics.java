/**
*Asks for name, age, and gender and calculates factors based on the user input.
*
*Activity 2
*Alexander Brannon - COMP 1210 - 001
*9/3/2017
*/
import java.util.Scanner;
/**
*Allows for user input.
*/
public class AgeStatistics
{
/**
*Calculates different factors based on age and gender.
*@param args Command line argument - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   //convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
   //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   
   }
}