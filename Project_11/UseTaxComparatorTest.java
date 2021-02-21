import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test for the UseTaxComparator class.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class UseTaxComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   *Test for the compare method.
   *@throws NegativeValueException - discludes negative values
   */
   @Test public void compareTest() throws NegativeValueException {
      
      UseTaxComparator com = new UseTaxComparator();
      
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      Assert.assertEquals("compare Test", -1, com.compare(vehicle1, vehicle2));
      Assert.assertEquals("compare Test", 1, com.compare(vehicle2, vehicle1));
      Assert.assertEquals("compare Test", 0, com.compare(vehicle1, vehicle1));
   }
}
