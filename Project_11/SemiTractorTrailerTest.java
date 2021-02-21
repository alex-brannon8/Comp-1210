import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*Test class for the SemiTractorTrailer class.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/

public class SemiTractorTrailerTest {

/** Fixture initialization (common initialization
 *  for all tests). **/
   @Before public void setUp() {
   }


/**
*Test for the getAxles method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void getAxlesTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer(
         "Williams, Pat", "2012 International Big Boy", 
         45000, false, 5.0, 4);
      
      Assert.assertEquals("getAxles Test", 4, semi1.getAxles());
   }
/**
*Test for the setAxles method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void setAxlesTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer(
         "Williams, Pat", "2012 International Big Boy", 
         45000, false, 5.0, 4);
         
      semi1.setAxles(5);
   
      Assert.assertEquals("setAxles Test", 5, semi1.getAxles());
   }
/**
*Test for the useTax method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer(
         "Williams, Pat", "2012 International Big Boy", 
         45000, false, 5.0, 4);
         
      Assert.assertEquals("useTax Test", 3150.00, semi1.useTax(),
         0.000001);
   }
/**
*Test for the toString method.
*@throws NegativeValueException - discludes negative values
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer(
         "Williams, Pat", "2012 International Big Boy", 
         45000, false, 5.0, 4);
         
      Assert.assertEquals("toString Test", true,
            semi1.toString().contains("Williams, Pat: SemiTractorTrailer"));
   }
}
