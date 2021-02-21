import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*Uses Spherocylinder Class and Spherocylinder List.
*
*Project 5
*Alexander Brannon - COMP 1210 - 004
*10/11/17
*/
public class SpherocylinderListApp {

/**
*Reads file of Spherocylinder and prints several aspects of it.
*
*@param args not used
*@throws FileNotFoundException required by scanner for file
*/
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<Spherocylinder> myList = new ArrayList<Spherocylinder>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String spherocylinderListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double cylinderHeight = Double.parseDouble(scanFile.nextLine());
         
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList.add(s);           
      }
      scanFile.close();
      SpherocylinderList mySpherocylinderList = 
         new SpherocylinderList(spherocylinderListName, myList);
      System.out.println("\n" + mySpherocylinderList);
      System.out.println("\n" + mySpherocylinderList.
         summaryInfo());                          
   }

      
   
   






}