import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
*Test for the Spherocylinder class.
*
*Project 8A
*Alexander Brannon - COMP 1210 - 004
*11/2/17
*/
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
*Test for the getter methods.
*/
   @Test public void gettersTest() {
      
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("Example", example.getLabel());
      Assert.assertEquals("getRadiusTest", 5, example.getRadius(), 0.0001);
      Assert.assertEquals("getCylinderHeightTest", 5, 
         example.getCylinderHeight(), 0.0001);
   }
/**
*Test for circumgference method.
*/   
   @Test public void circumferenceTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("circumferenceTest", 
         31.415926, example.circumference(), 0.000001);
   }
/**
*Test for surface area method.
*/   
   @Test public void surfaceAreaTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("surfaceAreaTest", 
         471.238898, example.surfaceArea(), 0.000001);
   }
/**
*Test for volume method.
*/   
   @Test public void volumeTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("volumeTest", 
         916.297857, example.volume(), 0.000001);
   }
/**
*Test for toString method.
*/   
   @Test public void toStringTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("toStringTest", true, 
         example.toString().contains("\"Example\""));
      
   }
/**
*Test for setLabel method.
*/   
   @Test public void setLabelTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
            
      Assert.assertEquals("setLabelTest", 
         true, example.setLabel("Example2"));
      Assert.assertEquals("setLabelTestFail", 
         false, example.setLabel(null));
   }
/**
*Test for setRadius method.
*/   
   @Test public void setRadiusTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
               
      Assert.assertEquals("setRadiusTest", true, example.setRadius(10));
      Assert.assertEquals("setRadiusTestFail", false, example.setRadius(-5));
   
   }
/**
*Test for setCylinderHeight method.
*/   
   @Test public void setCylinderHeightTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
            
      Assert.assertEquals("setCylinderHeightTest", 
         true, example.setCylinderHeight(10));
      Assert.assertEquals("setCylinderHeightTestFail", 
         false, example.setCylinderHeight(-5));
   }   
/**
*Test for getting count of Spherocylinders.
*/         
   @Test public void countTest() {
   
      Spherocylinder.resetCount(); 
      
      Assert.assertEquals("resetCountTest", 0, Spherocylinder.getCount()); 
      
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
      Spherocylinder example2 = new Spherocylinder("Example2", 5, 5);
    
      Assert.assertEquals("getCountTest", 2, Spherocylinder.getCount());   
   }
/**
*Test for hashCode method.
*/   
   @Test public void hashCodeTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
   
      Assert.assertEquals("getHashCodeTest", 0, example.hashCode());
   }
   /**
   *Tests the equals method.
   */
   @Test public void equalsTest() {
   
      Spherocylinder example = new Spherocylinder("Example", 5, 5);
      Spherocylinder example2 = new Spherocylinder("Example2", 5, 5);
      Spherocylinder example3 = new Spherocylinder("Example", 2, 5);
      Spherocylinder example4 = new Spherocylinder("Example", 5, 2);
      String example5 = "Spherocylinder";
      
      Assert.assertEquals("equalsTest", true, example.equals(example));
      Assert.assertEquals("equalsTestFail", false, example.equals(example2));
      Assert.assertEquals("equalsTestFail", false, equals(example5));
      Assert.assertEquals("equalsTestFail", false, example.equals(example3));
      Assert.assertEquals("equalsTestFail", false, example.equals(example4));
      Assert.assertEquals("equalsTestFail", false, example.equals(example5));
   }






   
   
   

   
   
   
}
