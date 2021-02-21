import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test class for the Truck class.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/   
public class TruckTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
*Test for the getTons method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void getTonsTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      
      Assert.assertEquals("getTons Test", 1.5, truck1.getTons(),
         0.000001); 
   }
/**
*Test for the setTons method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void setTonsTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
   
      truck1.setTons(2);
   
      Assert.assertEquals("setTonsTest", 2, truck1.getTons(), 
         0.000001);
   }
/**
*Test for the useTax method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
         
      Truck truck2 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, true, 1.5);
   
      Truck truck3 = new Truck("Williams, Sam", "2010 Chevy Mack", 
         40000, true, 2.5);
         
      Truck truck4 = new Truck("Williams, Sam", "2010 Chevy Mack", 
         40000, false, 2.5);
         
      Assert.assertEquals("useTax Test", 600.00, truck1.useTax(),
         0.000001);
         
      Assert.assertEquals("useTax Test", 300.00, truck2.useTax(),
         0.000001);
         
      Assert.assertEquals("useTax Test", 1600.00, truck3.useTax(),
         0.000001);
         
      Assert.assertEquals("useTax Test", 2000.00, truck4.useTax(),
         0.000001);
   }
/**
*Test for the toString method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
         
      Truck truck2 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, true, 1.5);
         
      Assert.assertEquals("toString Test", true, 
            truck1.toString().contains("Williams, Jo: Truck"));
            
      Assert.assertEquals("toString Test", true, 
            truck2.toString().contains("Williams, Jo: Truck"));
   }
}
