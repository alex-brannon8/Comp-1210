/**
*Class that is derived from Vehicle.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class Truck extends Vehicle {

   protected double tons;

/** The tax rate of the truck. */
   public static final double TAX_RATE = 0.02;

/** The tax rate of the truck if it uses alternative fuel. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;

/** If the truck weighs more than this then it is charged an extra tax. */
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;

/** Extra tax for heavier trucks. */
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;

/**
*@param ownerIn - for owner of truck
*@param yearMakeModelIn - for year, make, and model of truck
*@param valueIn - for value of truck
*@param alternativeFuelIn - for if the truck takes alternative fuel
*@param tonsIn - for how many tons the truck has
*/
   public Truck(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean alternativeFuelIn, double tonsIn) {
   
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      tons = tonsIn;
   }
/**
*Gets the tons.
*@return the tons
*/   
   public double getTons() {
      return tons;
   }
/**
*Sets the tons.
*@param tonsIn - for the tons
*/   
   public void setTons(double tonsIn) {
      tons = tonsIn;
   }
/**
*@return the tax of use plus the value
*/   
   public double useTax() {
   
      double useTax = 0;
      if (getAlternativeFuel()) {
         useTax = getValue() * ALTERNATIVE_FUEL_TAX_RATE;
         
         if (getTons() > LARGE_TRUCK_TONS_THRESHOLD) {
            useTax = getValue() * LARGE_TRUCK_TAX_RATE + useTax;
         }
      }
      else {
         useTax = getValue() * TAX_RATE;
         
         if (getTons() > LARGE_TRUCK_TONS_THRESHOLD) {
            useTax = getValue() * LARGE_TRUCK_TAX_RATE + useTax;
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
         + (getAlternativeFuel() ? "0.01" : "0.02")
         + (getTons() > LARGE_TRUCK_TONS_THRESHOLD 
         ? " Large Truck Tax Rate: 0.03" : "");
   }
}