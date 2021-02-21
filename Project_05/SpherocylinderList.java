import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*Represents a list of Spherocylinders.
*
*Project 5
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
   




}