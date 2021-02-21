import java.util.Scanner;
import java.io.FileNotFoundException;
/**
*Prints various things using Spherocylinder list.
*
*Project 7
*Alexander Brannon - COMP 1210 - 004
*10/22/17
*/
public class SpherocylinderList2MenuApp {
/**
*@param args - is not used.
* @throws FileNotFoundException if the file cannot be opened.
*/
   public static void main(String[] args) throws FileNotFoundException {
   
      String spheroListName = "*** no list name assigned ***";
      Spherocylinder[] myList = new Spherocylinder[20];
      SpherocylinderList2 spheroList = 
         new SpherocylinderList2(spheroListName, myList, 0);
      String fileName = "no file name";
      
      String label;
      double radius, cylinderHeight;  
      
      String code = "";
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Spherocylinder List System Menu\n"
         + "R - Read File and Create Spherocylinder List\n"
         + "P - Print Spherocylinder List\n" 
         + "S - Print Summary\n"
         + "A - Add Spherocylinder\n"  
         + "D - Delete Spherocylinder\n"   
         + "F - Find Spherocylinder\n"
         + "E - Edit Spherocylinder\n"
         + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile name: ");
               fileName = scan.nextLine().trim();
            
               spheroList = spheroList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Spherocylinder List created\n");
               break;
            
            case 'P': 
               System.out.println("\n" + spheroList + "");
               break;
               
            case 'S':
               System.out.println("\n" + spheroList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeight = Double.parseDouble(scan.nextLine());
            
               spheroList.addSpherocylinder(label, radius, cylinderHeight);
               System.out.println("\t*** Spherocylinder added ***\n");
               break; 
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               Spherocylinder c = spheroList.findSpherocylinder(label);
               if (c != null) {
                  spheroList.deleteSpherocylinder(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break; 
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine().trim();
               Spherocylinder s = spheroList.findSpherocylinder(label);
               if (s != null) {
                  System.out.print("" + s + "\n\n");
               }
               else {
                  System.out.print("\t\"" + label + "\" not found\n\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               Spherocylinder c2 = spheroList.findSpherocylinder(label);
              
               if (c2 != null) {
                  System.out.print("\tRadius: ");
                  radius = Double.parseDouble(scan.nextLine());
                  System.out.print("\tCylinder Height: ");
                  cylinderHeight = Double.parseDouble(scan.nextLine());
                  System.out.print("\t\"" + label 
                     + "\" successfully edited\n\n");
                  spheroList.editSpherocylinder(label, radius, cylinderHeight);
               
               }    
               else {
                  System.out.print("\tRadius: ");
                  radius = Double.parseDouble(scan.nextLine());
                  System.out.print("\tCylinder Height: ");
                  cylinderHeight = Double.parseDouble(scan.nextLine());
                  System.out.print("\t\"" + label + "\" not found\n\n");  
               }
            
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.print("\t*** invalid code ***\n\n");
               
         } 
      
      
      } while (!code.equalsIgnoreCase("Q")); 
   }
}