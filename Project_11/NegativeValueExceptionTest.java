import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
   *Test class for NegativeValueException.
*
*Project 11
*Alexander Brannon - COMP 1210 - 004
*12/7/17
*/
public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
*Test for NegativeValueException.
*/
   @Test public void negativeValueExceptionTest() {
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false);
      }
      catch (NegativeValueException e) {
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   /* or alternatively: */
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         true, thrown);
   }
}
