import java.util.ArrayList;
/**
*Creates a class for temperatures.
*
*Activity 6
*Alexander Brannon - COMP 1210 - 004
*10/15/17
*/
public class Temperatures {

   private ArrayList<Integer> temperatures;
/**
*@param temperaturesIn for temperatures
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }
/**
*@return the low temperature
*/ 
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < low; i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
/**
*@return the high temperature
*/ 
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
/**
*@param lowIn for low temperature
*@return the low temperature
*/   
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
/**
*@param highIn for high temperature
*@return the high temperature
*/   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
/**
*@return the output string
*/  
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
   


}