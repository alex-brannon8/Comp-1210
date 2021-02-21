/**
*Class that is derived from Vehicle.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class Car extends Vehicle {

/** The tax rate of the car. */
   public static final double TAX_RATE = 0.01;
/** The tax rate of the car if it uses alternative fuel. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
/** If car costs more than this then it has extra tax. */
   public static final double LUXURY_THRESHOLD = 50_000;
/** Extra tax for luxury cars. */
   public static final double LUXURY_TAX_RATE = 0.02;
/**
*@param ownerIn - for owner of car
*@param yearMakeModelIn - for year, make, and model of car
*@param valueIn - for value of car
*@param alternativeFuelIn - for if the car takes alternative fuel
*/
   public Car(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean alternativeFuelIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
   }
/**
*@return the tax of use plus the value
*/   
   public double useTax() {
   
      double useTax = 0;
      if (getAlternativeFuel()) {
         useTax = getValue() * ALTERNATIVE_FUEL_TAX_RATE;
         
         if (getValue() > LUXURY_THRESHOLD) {
            useTax = getValue() * LUXURY_TAX_RATE + useTax;
         }
      }
      else {
         useTax = getValue() * TAX_RATE;
         
         if (getValue() > LUXURY_THRESHOLD) {
            useTax = getValue() * LUXURY_TAX_RATE + useTax;
         }
      }
      return useTax;
   }
/**
*Output of the class.
*@return the desired output of the class
*/   
   public String toString() {
   
      return super.toString() + "\nwith Tax Rate: "
         + (getAlternativeFuel() ? "0.005" : "0.01")
         + (value > LUXURY_THRESHOLD
         ? " Luxury Tax Rate: 0.02" : "");
   }


}