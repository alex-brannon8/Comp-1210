/**
*Class that is derived from Vehicle.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class Motorcycle extends Vehicle {

   protected double engineSize;

/** Tax rate of the motorcycle. */
   public static final double TAX_RATE = 0.005;

/** Tax rate for the alternative fuel. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;

/** If the motorcycle breaks this threshold, it is charged more. */
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;

/** Tax rate for large bikes. */
   public static final double LARGE_BIKE_TAX_RATE = 0.015;

/**
*@param ownerIn - for owner of motorcycle
*@param yearMakeModelIn - for year, make, and model of motorcycle
*@param valueIn - for value of motorcycle
*@param alternativeFuelIn - for if the motorcycle takes alternative fuel
*@param engineSizeIn - for size of engine of motorcycle
*/   
   public Motorcycle(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean alternativeFuelIn, double engineSizeIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      engineSize = engineSizeIn; 
   }
/**
*Gets the engine size.
*@return the engine size
*/   
   public double getEngineSize() {
      return engineSize;
   }
/**
*Sets the engine size.
*@param engineSizeIn - for engine size
*/   
   public void setEngineSize(double engineSizeIn) {
      engineSize = engineSizeIn;
   }
/**
*Returns the tax of use plus the value.
*@return the tax plus value
*/   
   public double useTax() {
   
      double useTax = 0;
      if (getAlternativeFuel()) {
         useTax = getValue() * ALTERNATIVE_FUEL_TAX_RATE;
         
         if (getEngineSize() >  LARGE_BIKE_CC_THRESHOLD) {
            useTax = getValue() * LARGE_BIKE_TAX_RATE + useTax;
         }
      }
      else {
         useTax = getValue() * TAX_RATE;
         
         if (getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
            useTax = getValue() * LARGE_BIKE_TAX_RATE + useTax;
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
         + (getAlternativeFuel() ? "0.0025" : "0.005") 
         + (getEngineSize() > LARGE_BIKE_CC_THRESHOLD
         ? " Large Bike Tax Rate: 0.015" : "");
   }
}