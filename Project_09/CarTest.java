import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test class for the Car class.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class CarTest {

/** Fixture initialization (common initialization
 *  for all tests). **/
   @Before public void setUp() {
   }

/**
*Test for the useTax method.
*/
   @Test public void useTaxTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 
         22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);
      
      Assert.assertEquals("useTax Test", 220.00, car1.useTax(),
         0.000001);
       
      Assert.assertEquals("useTax Test", 110.00, car2.useTax(),
         0.000001);
         
      Assert.assertEquals("useTax Test", 3300.00, car3.useTax(),
         0.000001);
         
      Assert.assertEquals("useTax Test", 2750.00, car4.useTax(),
         0.000001);
   }
/**
*Test for the toString method.
*/
   @Test public void toStringTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 
         22000, true);
         
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
         
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);
   
      Assert.assertEquals("toString Test", true, car1.toString().contains(
         "0.01"));
      
      Assert.assertEquals("toString Test", true, car2.toString().contains(
         "0.005"));
         
      Assert.assertEquals("toString Test", true, car3.toString().contains(
         "0.01"));
         
      Assert.assertEquals("toString Test", true, car4.toString().contains(
         "0.005"));
   }
/**
*Test for the getOwner method.
*/   
   @Test public void getOwnerTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      
      Assert.assertEquals("getOwner Test", "Jones, Sam", 
         car1.getOwner());
   }
/**
*Test for the setOwner method.
*/   
   @Test public void setOwnerTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      car1.setOwner("John, Jimmy");
      
      Assert.assertEquals("setOwner Test", "John, Jimmy",
         car1.getOwner());
   }
/**
*Test for the getYearMakeModel method.
*/   
   @Test public void getYearMakeModel() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      Assert.assertEquals("getYearMakeModel Test",
         "2017 Honda Accord", car1.getYearMakeModel());
   }
/**
*Test for the setYearMakeModel method.
*/   
   @Test public void setYearMakeModel() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      car1.setYearMakeModel("2018 Nissan Altima");
   
      Assert.assertEquals("setYearMakeModel Test",
         "2018 Nissan Altima", car1.getYearMakeModel());
   }
/**
*Test for the getValueTest method.
*/   
   @Test public void getValueTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      Assert.assertEquals("getValue Test", 22000, car1.getValue(),
         0.000001);
   }
/**
*Test for the setValue method.
*/  
   @Test public void setValueTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      car1.setValue(10000);
         
      Assert.assertEquals("setValue Test", 10000, car1.getValue(),
            0.000001);
   }
/**
*Test for the getAlternativeFuel method.
*/   
   @Test public void getAlternativeFuelTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 
         22000, true);
         
      Assert.assertEquals("getAlternativeFuel Test", false, 
         car1.getAlternativeFuel());
         
      Assert.assertEquals("getAlternativeFuel Test", true, 
         car2.getAlternativeFuel());
   }
/**
*Test for the setAlternativeFuel method.
*/   
   @Test public void setAlternativeFuelTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 
         22000, true);
         
      car1.setAlternativeFuel(true);
      car2.setAlternativeFuel(false);
         
      Assert.assertEquals("getAlternativeFuel Test", true, 
         car1.getAlternativeFuel());
         
      Assert.assertEquals("getAlternativeFuel Test", false, 
         car2.getAlternativeFuel());
   }
}
