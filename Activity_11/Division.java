/**
*Class that divides two integers.
*
*Activity 11
*Alexander Brannon - COMP 1210 - 004
*12/3/17
*/
public class Division {
/**
*Divides two integers and returns the answer as an integer.
*@param num - for numerator
*@param denom - for denominator
*@return the answer as an integer
*/
   public static int intDivide(int num, int denom) {
      
      try {
         return num / denom; 
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
/**
*Divides two integers and returns the answer as a double using casting.
*@param num - for numerator
*@param denom - for denominator
*@return the answer as a double
*/
   public static double decimalDivide(int num, int denom) {
   
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double result = (double) num / denom;
      return result;
   }
}