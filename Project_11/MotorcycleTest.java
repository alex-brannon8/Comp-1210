import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test class for the Motorcycle class.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/  
public class MotorcycleTest {

/** Fixture initialization (common initialization
 *  for all tests). **/
   @Before public void setUp() {
   }
/**
*Test for the getEngineSize method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void getEngineSizeTest() 
      throws NegativeValueException {
      
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      Assert.assertEquals("getEngineSize Test", 750,
         bike1.getEngineSize(), 0.000001);  
   }
/**
*Test for setEngineSize method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void setEngineSizeTest() 
      throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      bike1.setEngineSize(800);
      
      Assert.assertEquals("setEngineSize Test", 800, 
         bike1.getEngineSize(), 0.000001);
   }
/**
*Test for the useTax method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
     
      Motorcycle bike2 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 750);
      
      Motorcycle bike3 = new Motorcycle("Brando, John", 
         "1964 Harley-Davidson Sportster", 14000, false, 400);
      
      Motorcycle bike4 = new Motorcycle("Brando, John", 
         "1964 Harley-Davidson Sportster", 14000, true, 400);
         
      Assert.assertEquals("useTax Test", 280.00,
            bike1.useTax(), 0.000001);
            
      Assert.assertEquals("useTax Test", 245.00,
            bike2.useTax(), 0.000001);
            
      Assert.assertEquals("useTax Test", 70.00,
            bike3.useTax(), 0.000001);
            
      Assert.assertEquals("useTax Test", 35.00,
            bike4.useTax(), 0.000001);
   }
/**
*Test for the toString method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      Motorcycle bike2 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 750);
      
      Motorcycle bike3 = new Motorcycle("Brando, John", 
         "1964 Harley-Davidson Sportster", 14000, false, 400);
      
      Motorcycle bike4 = new Motorcycle("Brando, John", 
         "1964 Harley-Davidson Sportster", 14000, true, 400);
         
      Assert.assertEquals("toString Test", true, 
            bike1.toString().contains("Brando, Marlon: Motorcycle"));
            
      Assert.assertEquals("toString Test", true, 
           bike2.toString().contains("Brando, Marlon: Motorcycle"));
            
      Assert.assertEquals("toString Test", true, 
           bike3.toString().contains("Brando, John: Motorcycle"));
            
      Assert.assertEquals("toString Test", true, 
            bike4.toString().contains("Brando, John: Motorcycle"));
   }
}
