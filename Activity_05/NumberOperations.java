/**
*Gives information about a number given by the user.
*
*Activity 5
*Alexander Brannon - COMP 1210 - 004
*10/3/17
*/
public class NumberOperations {
   private int number;
/**
*Gives information about number given by user.
*@param numberIn - number given by user.
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
/**
*@return number - returns the number
*/
   public int getValue() {
      return number;
   }
/**
*@return output - returns the output
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
/**
*@return output - returns the output
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
/**
*@return 1 - returns the integer 1
*@param compareNumber - compares the number
*/
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
/**
*@return number - returns the number and the string.
*/
   public String toString() {
      return number + "";
   }
   
   
   
   
   
   
   
   
}