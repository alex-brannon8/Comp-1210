import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
*Represents a list of Spherocylinders.
*
*Project 8
*Alexander Brannon - COMP 1210 - 004
*10/11/17
*/
public class SpherocylinderList2 {

   private String listName;
   private Spherocylinder[] spheroList;
   private int num;
   /**
   *@param listNameIn for listName
   *@param spheroListIn for spheroList
   *@param numIn for number of elements
   */
   public SpherocylinderList2(String listNameIn, 
      Spherocylinder[] spheroListIn, int numIn) {
      
      listName = listNameIn;
      spheroList = spheroListIn;
      num = numIn;
   }
   /**
   *@return the list name
   */
   public String getName() {
      return listName;
   }
   /**
   *@return the number of spherocylinders
   */
   public int numberOfSpherocylinders() {
      if (num > 0) {
         return num;
      }
      else {
         return 0;
      }
   }
   /**
   *@return the total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < num) {
         total += spheroList[index].surfaceArea();
         index++;  
      }   
      return total;
   }
   /**
   *@return the total volume
   */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < num) {
         total += spheroList[index].volume();
         index++;  
      }   
      return total;
   }
   /**
   *@return the average of the surface areas
   */
   public double averageSurfaceArea() {
      double average = 0;
      int index = 0;
      while (index < num) {
         average += spheroList[index].surfaceArea() / num;
         index++;  
      }   
      return average;
   
   }
   /**
   *@return the average of the volumes
   */
   public double averageVolume() {
      double average = 0;
      int index = 0;
      while (index < num) {
         average += spheroList[index].volume() / num;
         index++;  
      }   
      return average;
   }
   /**
   *@return the string for the list
   */
   public String toString() {
      String result = "" + listName + "\n";
      int index = 0;
      while (index < num) {
         result += "\n" + spheroList[index] + "\n"; 
         index++;  
      }   
      return result;
   }
   /**
   *@return the summary info
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Spherocylinders: " + numberOfSpherocylinders();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
   
   }
   /**
   *@return Spherocylinder list
   */
   public Spherocylinder[] getList() {
      return spheroList;
   }
   /**
   *@return spherocylinder list
   *@param fileNameIn used for file name
   *@throws FileNotFoundException - allows for file to be read
   */
  
   public SpherocylinderList2 readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String spheroListName = scanFile.nextLine(); 
      Spherocylinder[] myList = new Spherocylinder[20];
          
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList[num] = s;
         num++;        
      }
      scanFile.close();
      SpherocylinderList2 sL = 
         new SpherocylinderList2(spheroListName, myList, num);
      return sL;
   } 
   /**
   *@param label - label of Spherocylinder
   *@param radius - radius of spherocylinder
   *@param cylinderHeight - cylinder height of spherocylinder
   */
   public void addSpherocylinder(String label, 
      double radius, double cylinderHeight) {
       
      Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
      spheroList[num] = s;
      num++;
   }
   /**
   *@param labelIn - label
   *@return the result
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
      
      Spherocylinder result = null;
      int index = -1;
      for (int i = 0; i < num; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = spheroList[i];
         }     
      }
      return result;
   }
   /**
   *@param labelIn - label
   *@return the result
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      Spherocylinder result = null;
      int index = -1;
      for (int i = 0; i < num; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn)) { 
            for (int j = i; j < num - 1; j++) {
               spheroList[j] = spheroList[j];
            }
            spheroList[num - 1] = null; 
            num--;
            result = spheroList[i];
            break;
         }
      }
      return result;
   }
   /**
   *@param labelIn - label of spherocylinder
   *@param radiusIn - label of spherocylinder
   *@param cylinderHeightIn - label of spherocylinder
   *@return the result
   */
   public boolean editSpherocylinder(String labelIn, 
      double radiusIn, double cylinderHeightIn) {
      boolean result = false;
      int index = -1;
      for (int i = 0; i < num; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn) 
            && spheroList[i].getRadius() == radiusIn 
            && spheroList[i].getCylinderHeight() 
            == cylinderHeightIn) {
                         
            spheroList[i].setRadius(radiusIn);
            spheroList[i].setCylinderHeight(cylinderHeightIn);
            result = true;
         }
      }
      return result;
   }
   /**
   *Finds the Spherocylinder with the shortest radius.
   *@return the spherocylinder with the shortest radius
   */
   public Spherocylinder findSpherocylinderWithShortestRadius() {
      if (num == 0) {
         return null;
      }
      else {
         double smallest = spheroList[0].getRadius();
         int index = 0;
         while (index < num) {
            if (smallest > spheroList[index].getRadius()) {
               smallest = spheroList[index].getRadius();
            }
            index++; 
            
         }   
         return spheroList[index];        
      }
   }
  /**
  *Finds the Spherocylinder with the longest radius.
  *@return the spherocylinder with the longest radius
  */ 
   public Spherocylinder findSpherocylinderWithLongestRadius() {
      if (num == 0) {
         return null;
      }
      else { 
         double largest = spheroList[0].getRadius();
         int index = 0;
         while (index < num) {
            if (largest < spheroList[index].getRadius()) {
               largest = spheroList[index].getRadius();
            }
            index++;
              
         }   
         return spheroList[0];
      }
   }
  /**
  *Finds the Spherocylinder with the smallest volume.
  *@return the spherocylinder with the smallest volume
  */ 
   public Spherocylinder findSpherocylinderWithSmallestVolume() {
      if (num == 0) {
         return null;
      }
      else { 
         double smallest = spheroList[0].volume();
         int index = 0;
         while (index < num) {
            if (smallest > spheroList[index].volume()) {
               smallest = spheroList[index].volume();
            }
            index++;
              
         }   
         return spheroList[0];
      }
   }
  /**
  *Finds the Spherocylinder with the largest volume.
  *@return the spherocylinder with the largest volume
  */ 
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (num == 0) {
         return null;
      } 
      else {
         double largest = spheroList[0].volume();
         int index = 0;
         while (index < num) {
            if (largest < spheroList[index].volume()) {
               largest = spheroList[index].volume();
            }
            index++;
              
         }   
         return spheroList[0];
      }
   }
}
