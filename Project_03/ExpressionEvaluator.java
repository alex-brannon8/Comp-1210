import java.util.Scanner;
import java.text.DecimalFormat;
/**
*Asks the user to input a value, x, and will do 
*several calculations on the user's input.
*
*Project 3
*Alexander Brannon - COMP 1210 - 004
*9/15/17
*/
public class ExpressionEvaluator
{
/**
*Does calculations on the user's input of the value x.
*@param args Command line arguments - allows for user input.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      double x = 0;
      double expressionResult = 0;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      expressionResult = Math.sqrt(Math.abs(23.7 * Math.pow(x, 9))
         + -x);
      expressionResult = expressionResult / (7.3 * Math.pow(x, 2) + 5.2 * x 
         + 3.1);
      
      System.out.println("Result: " + expressionResult);
      String decimal = Double.toString(expressionResult);
      int integers = decimal.indexOf('.');
      int left = integers;
      int right = decimal.length() - integers - 1;
      System.out.println("# digits to left of decimal point: " + left);
      System.out.println("# digits to right of decimal point: " + right);
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      System.out.println("Formatted Result: " + df.format(expressionResult));
      
      
      
    
   
   
   }




}