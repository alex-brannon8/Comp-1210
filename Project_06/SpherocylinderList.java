import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
*Represents a list of Spherocylinders.
*
*Project 6
*Alexander Brannon - COMP 1210 - 004
*10/11/17
*/
public class SpherocylinderList {

   private String name;
   private ArrayList<Spherocylinder> spheroList;
   /**
   *@param nameIn for listName
   *@param spheroListIn for spheroList
   */
   public SpherocylinderList(String nameIn, 
      ArrayList<Spherocylinder> spheroListIn) {
      
      name = nameIn;
      spheroList = spheroListIn;
   }
   /**
   *@return the list name
   */
   public String getName() {
      return name;
   }
   /**
   *@return the number of spherocylinders
   */
   public int numberOfSpherocylinders() {
      return spheroList.size();
   }
   /**
   *@return the total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < spheroList.size()) {
         total += spheroList.get(index).surfaceArea();
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
      while (index < spheroList.size()) {
         total += spheroList.get(index).volume();
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
      while (index < spheroList.size()) {
         average += spheroList.get(index).surfaceArea() / spheroList.size();
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
      while (index < spheroList.size()) {
         average += spheroList.get(index).volume() / spheroList.size();
         index++;  
      }   
      return average;
   }
   /**
   *@return the string for the list
   */
   public String toString() {
      String result = "" + name + "\n";
      int index = 0;
      while (index < spheroList.size()) {
         result += "\n" + spheroList.get(index) + "\n"; 
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
   public ArrayList<Spherocylinder> getList() {
      return spheroList;
   }
   /**
   *@return spherocylinder list
   *@param fileNameIn used for file name
   *@throws FileNotFoundException - allows for file to be read
   */
  
   public SpherocylinderList readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Spherocylinder> myList = new ArrayList<Spherocylinder>();
      String spheroListName = scanFile.nextLine(); 
           
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList.add(s);           
      }
      scanFile.close();
      SpherocylinderList sL = 
         new SpherocylinderList(spheroListName, myList);
      
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
      
      spheroList.add(s);
   }
   /**
   *@param labelIn - label
   *@return the result
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
      
      Spherocylinder result = null;
      for (Spherocylinder s : spheroList) {
         if (s.getLabel().equalsIgnoreCase(labelIn)) {
            result = s;
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
      result = findSpherocylinder(labelIn);
      if (result != null) {
         spheroList.remove(result);
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
      for (Spherocylinder s : spheroList) {
         if (s.getLabel().equalsIgnoreCase(labelIn)) {
            s.setRadius(radiusIn);
            s.setCylinderHeight(cylinderHeightIn);
            result = true;
         }
      }
      return result;
   }

}
