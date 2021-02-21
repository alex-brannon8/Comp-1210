/**
*Class that is derived from truck which is derived from Truck.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class SemiTractorTrailer extends Truck {

   protected int axles;
   
/** Tax for axles. */
   public static final double PER_AXLE_TAX_RATE = 0.005;

/**
*@param ownerIn - for owner of semi
*@param yearMakeModelIn - for year, make, and model of semi
*@param valueIn - for value of semi
*@param alternativeFuelIn - for if the semi takes alternative fuel
*@param tonsIn - for how many tons the semi has
*@param axlesIn - for axles of semi
*@throws NegativeValueException - to disclude negative values
*/
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn, 
      double valueIn, boolean alternativeFuelIn, double tonsIn,
      int axlesIn) throws NegativeValueException {
   
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn, 
         tonsIn);
      if (axlesIn < 0) {
         throw new NegativeValueException();
      }
      else {
         axles = axlesIn;
      }
   }
/**
*Gets the axles.
*@return the axles
*/   
   public int getAxles() {
      return axles;
   }
/**
*Sets the axles.
*@param axlesIn - for axles
*/   
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
/**
*Returns the tax of use plus the value.
*@return tax of use plus the value
*/   
   public double useTax() {
    
      return super.useTax() + getValue()
         * PER_AXLE_TAX_RATE * getAxles();
   }
/**
*Output of the class.
*@return the desired output of the class
*/   
   public String toString() {
   
      return super.toString() + " Axle Tax Rate: " 
         + PER_AXLE_TAX_RATE * getAxles();
   }
}
