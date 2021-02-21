import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.io.FileNotFoundException;

/**
*Test class for the VehiclesPart2 class.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/28/17
*/
public class VehiclesPart2Test {
/**Fixture initialization (common initialization
*for all tests). 
**/
   @Before public void setUp() {
   }
   /**
   *Test for main method.
   *@throws FileNotFoundException to read file
   */
   @Test public void mainTest() throws FileNotFoundException {
   
      VehiclesPart2 vPart2Obj = new VehiclesPart2(); 
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }
   
}
