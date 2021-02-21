import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
/**
*Test for the SpherocylinderList2 class.
*
*Project 8B
*Alexander Brannon - COMP 1210 - 004
*11/10/17
*/
public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      
   }

/**
*Test for the getName method.
*/
   @Test public void getNameTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("getNameTest", "Test List", spheroList.getName());
   }
/**
*Test for the numberOfSpherocylinders method.
*/   
   @Test public void numberOfSpherocylindersTest() {
      
      Spherocylinder[] spheroArray2 = new Spherocylinder[0];
      SpherocylinderList2 spheroList2 = 
         new SpherocylinderList2("Test List 2", spheroArray2, 0);
      
      Assert.assertEquals("0", 0, spheroList2.numberOfSpherocylinders());
      
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("Pass", 3, spheroList.numberOfSpherocylinders());
      
   }
/**
*Test for the totalSurfaceArea method.
*/   
   @Test public void totalSurfaceAreaTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
      
      Assert.assertEquals("totalSurfaceAreaTest", 
         1413.716694, spheroList.totalSurfaceArea(), 0.000001);
   }
/**
*Test for the totalVolume method.
*/   
   @Test public void totalVolumeTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("totalVolumeTest", 
         2748.893571, spheroList.totalVolume(), 0.000001);
   }
/**
*Test for the averageSurfaceArea method.
*/   
   @Test public void averageSurfaceAreaTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("averageSurfaceAreaTest", 
         471.238898, spheroList.averageSurfaceArea(), 0.000001);
   }
/** 
*Test for the averageVolume method.
*/  
   @Test public void averageVolumeTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("averageVolumeTest", 
         916.297857, spheroList.averageVolume(), 0.000001);
   }
/**
*Test for the toString method.
*/  
   @Test public void toStringTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("toStringTest", true, 
         spheroList.toString().contains("with radius "
         + "5.0 and cylinder height 5.0"));
   }
/**
*Test for the summaryInfo method.
*/   
   @Test public void summaryInfoTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("summaryInfoTest", true, 
         spheroList.summaryInfo().contains("Number of " 
         + "Spherocylinders: 3"));
   }
/**
*Test for the getList method.
*/   
   @Test public void getListTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("getListTest", spheroArray, spheroList.getList());
   }
/**
*Test for the readFile method.
*@throws IOException allows for file to be read in
*/   
   @Test public void readFileTest() throws IOException {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = new 
         SpherocylinderList2("Test List", null, 0);
         
      spheroList = spheroList.readFile("Spherocylinder_data_1.txt");
      
      Assert.assertEquals("readFileTest", "Spherocylinder Test List",
         spheroList.getName());
   }
/**
*Test for the addSpherocylinder method.
*/   
   @Test public void addSpherocylinderTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Spherocylinder added = 
         new Spherocylinder("Added", 5, 5);
         
      spheroList.addSpherocylinder("Added", 5, 5);
      Spherocylinder[] spheroArray2 = spheroList.getList();
   
      Assert.assertEquals("addSpherocylinderTest", added, spheroArray2[3]);
   }
/**
*Test for the findSpherocylinder method.
*/   
   @Test public void findSpherocylinderTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("findSpherocylinderTest Fail", null, 
         spheroList.findSpherocylinder("Example"));
      Assert.assertEquals("findSpherocylinderTest", spheroArray[0], 
         spheroList.findSpherocylinder("Example1"));
   }
/**
*Test for the deleteSpherocylinder method.
*/   
   @Test public void deleteSpherocylinderTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("deleteSpherocylinderTest Fail", null, 
         spheroList.deleteSpherocylinder("Example"));
      Assert.assertEquals("deleteSpherocylinderTest", spheroArray[0],
         spheroList.deleteSpherocylinder("Example1"));
   }
 /**
 *Test for the editSpherocylinder method.
 */  
   @Test public void editSpherocylinderTest() {
   
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 5, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("editSpherocylinderTest Fail", false, 
         spheroList.editSpherocylinder("Example", 5, 5));
      Assert.assertEquals("editSpherocylinderTest Fail", false,
         spheroList.editSpherocylinder("Example1", 5, 6));
      Assert.assertEquals("editSpherocylinderTest Fail", false,
         spheroList.editSpherocylinder("Example1", 6, 5));
      Assert.assertEquals("editSpherocylinderTest Fail", true,
         spheroList.editSpherocylinder("Example1", 5, 5));
   }
 /**
 *Test for the findSpherocylinderWithShortestRadius method.
 */
   @Test public void findSpherocylinderWithShortestRadiusTest() {
   
      Spherocylinder[] spheroArray2 = new Spherocylinder[0];
      SpherocylinderList2 spheroList2 = 
         new SpherocylinderList2("Test List 2", spheroArray2, 0);
         
      Assert.assertEquals("shortestRadiusTest Fail", null, 
         spheroList2.findSpherocylinderWithShortestRadius());
      
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 4, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 6, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("shortestRadiusTest",
         spheroArray[0], 
         spheroList.findSpherocylinderWithShortestRadius());      
   }
 /**
 *Test for the findSpherocylinderWithLongestRadius method.
 */
   @Test public void findSpherocylinderWithLongestRadiusTest() {
   
      Spherocylinder[] spheroArray2 = new Spherocylinder[0];
      SpherocylinderList2 spheroList2 = 
         new SpherocylinderList2("Test List 2", spheroArray2, 0);
   
      Assert.assertEquals("longestRadiusTest Fail", null, 
         spheroList2.findSpherocylinderWithLongestRadius());
         
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 4, 5);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 6, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
   
      Assert.assertEquals("longestRadiusTest", spheroArray[2], 
         spheroList.findSpherocylinderWithLongestRadius());
   }
 /**
 *Test for the findSpherocylinderWithSmallestVolume method.
 */
   @Test public void findSpherocylinderWithSmallestVolume() {
   
      Spherocylinder[] spheroArray2 = new Spherocylinder[0];
      SpherocylinderList2 spheroList2 = 
         new SpherocylinderList2("Test List 2", spheroArray2, 0);
   
      Assert.assertEquals("smallestVolumeTest Fail", null, 
         spheroList2.findSpherocylinderWithSmallestVolume());
         
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 2, 2);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
         
      Assert.assertEquals("smallestVolumeTest", spheroArray[0],
         spheroList.findSpherocylinderWithSmallestVolume());
   
   
   }
 /**
 *Test for the findSpherocylinderWithLargestVolume method.
 */  
   @Test public void findSpherocylinderWithLargestVolume() {
   
      Spherocylinder[] spheroArray2 = new Spherocylinder[0];
      SpherocylinderList2 spheroList2 = 
         new SpherocylinderList2("Test List 2", spheroArray2, 0);
   
      Assert.assertEquals("largestVolumeTest Fail", null, 
         spheroList2.findSpherocylinderWithLargestVolume());
         
      Spherocylinder[] spheroArray = new Spherocylinder[20];
      spheroArray[0] = new Spherocylinder("Example1", 10, 10);
      spheroArray[1] = new Spherocylinder("Example2", 5, 5);
      spheroArray[2] = new Spherocylinder("Example3", 5, 5);
      
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2("Test List", spheroArray, 3);
         
      Assert.assertEquals("largestVolumeTest", spheroArray[0],
         spheroList.findSpherocylinderWithLargestVolume());
   
   
   
   }


}
