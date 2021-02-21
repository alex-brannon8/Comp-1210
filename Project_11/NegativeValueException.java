/**
*Exception class that does not allow negative values in certain areas.
*
*Project 11
*Alexander Brannon - COMP 1210 - 004
*12/7/17
*/
public class NegativeValueException extends Exception {
/**
*Constructor for the class.
*/
   public NegativeValueException() {
   
      super("Numeric values must be nonnegative");
   }
/**
*String method for the class.
*@return the desired output
*/
   public String toString() {
   
      String output = "NegativeValueException: " 
         + "Numeric values must be nonnegative";
      return output;
   }
   
   
   



}