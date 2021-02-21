import java.util.Comparator;
/**
*Class that compares the use tax in the vehicles array.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class UseTaxComparator implements Comparator<Vehicle> {
/**
*Compares the use tax of vehicles.
*@param v1 - for vehicle one
*@param v2 - for vehicle two
*@return the list in order from least to greatest use tax
*/
   public int compare(Vehicle v1, Vehicle v2) {
      
      int output = Double.compare(v1.useTax(), v2.useTax());
      return output;
   }
}