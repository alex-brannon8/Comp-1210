import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test class for the VehiclePart1 class.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class VehiclesPart1Test {

/** Fixture initialization (common initialization
 *  for all tests). **/
   @Before public void setUp() {
   }
/**
*Test for the main method.
*/
   @Test public void mainTest() {
     
      VehiclesPart1 vp1 = new VehiclesPart1();  
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null); 
      Assert.assertEquals("vehicleCount Test",
         4, Vehicle.getVehicleCount());   
   }
}
