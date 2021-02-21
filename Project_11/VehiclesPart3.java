import java.io.FileNotFoundException;
/**
*Driver class for UseTaxList.
*
*Project 11
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class VehiclesPart3 {
/**
*Main method for class.
*@param args - not used
*/
   public static void main(String[] args) {
    
      if (args.length == 0) {
         System.out.print("*** File name not provided by command "
            + "line argument.\n"
            + "Program ending.");
      }
      else {
         try {  
            String fileName = args[0];
            UseTaxList taxList = new UseTaxList();
            taxList.readVehicleFile(fileName);
            System.out.print("" + taxList.summary() + "\n");
            System.out.print("" + taxList.listByOwner() + "\n");
            System.out.print("" + taxList.listByUseTax() + "\n");
            System.out.print("" + taxList.excludedRecordsList());
         }
         catch (FileNotFoundException e) {
            System.out.print("*** File not Found.\n"
               + "Program ending.");
         } 
      }
     
      
   }





}