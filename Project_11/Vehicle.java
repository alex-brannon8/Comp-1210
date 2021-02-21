import java.text.DecimalFormat;
/**
*Class that has multiple classes derived from it.
*
*Project 11
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public abstract class Vehicle implements Comparable<Vehicle> {

   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   protected static int vehicleCount = 0;
/**
*@param ownerIn - for owner of vehicle
*@param yearMakeModelIn - for year, make, and model of vehicle
*@param valueIn - for value of vehicle
*@param alternativeFuelIn - for if the vehicle takes alternative fuel
*@throws NegativeValueException - to disclude negative values
*/   
   public Vehicle(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean alternativeFuelIn) throws NegativeValueException {
   
      owner = ownerIn;
      yearMakeModel = yearMakeModelIn;
      if (valueIn < 0) {
         throw new NegativeValueException();
      }
      else {
         value = valueIn;
      }
      alternativeFuel = alternativeFuelIn;
      vehicleCount++;
   }
/**
*Gets the owner.
*@return the owner
*/   
   public String getOwner() {
      return owner;
   }
/**
*Sets the owner.
*@param ownerIn - for the owner
*/
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
/**
*Gets the year, make, and model.
*@return the year, make, and model
*/   
   public String getYearMakeModel() {
      return yearMakeModel;
   }
/**
*Sets the year, make, and model.
*@param yearMakeModelIn - for the year, make, and model
*/   
   public void setYearMakeModel(String yearMakeModelIn) {
      yearMakeModel = yearMakeModelIn;
   }
/**
*Gets the value.
*@return the value
*/   
   public double getValue() {
      return value;
   }
/**
*Sets the value.
*@param valueIn - for the value
*/   
   public void setValue(double valueIn) {
      value = valueIn;
   }
/**
*Sees if the vehicle takes alternative fuel.
*@return alternative fuel
*/   
   public boolean getAlternativeFuel() {
      return alternativeFuel;
   }
/**
*Sets alternative fuel as true or false.
*@param alternativeFuelIn - for alternative fuel
*/   
   public void setAlternativeFuel(boolean alternativeFuelIn) {
      alternativeFuel = alternativeFuelIn;
   }
/**
*Gets the vehicle count.
*@return the vehicle count
*/   
   public static int getVehicleCount() {
      return vehicleCount;
   }
/**
*Resets the vehicle count.
*/   
   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
/**
*For tax of use.
*@return tax of use in derived classes
*/   
   public abstract double useTax(); 
/**
*Output of the class.
*@return the desired output of the class
*/   
   public String toString() {
   
      DecimalFormat x = new DecimalFormat("$#,##0.00");
      return getOwner() + ": " + this.getClass().getName() 
         + " " + getYearMakeModel() + " " 
         + (getAlternativeFuel() ? "(Alternative Fuel)" : "") 
         + "\nValue: " + x.format(getValue()) + " Use Tax: " 
         + x.format(useTax());
   }
/**
* @param obj the other object
* @return boolean
*/
   public boolean equals(Object obj) {
      if (!(obj instanceof Vehicle)) {
         return false;
      }
      else {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel + other.value);
      }
   }
/** 
*@return 0 
*/
   public int hashCode() {
      return 0;
   }
/**
*@param obj - for a vehicle
*@return number based on comparison
*/
   public int compareTo(Vehicle obj) {
           
      return 0;
   
   }
}