import java.io.FileNotFoundException;
/**
*Driver class for UseTaxList that prints out multiple lists.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class VehiclesPart2 {
/**
*Prints an array of vehicles based on desired output.
*@param args - not used
*@throws FileNotFoundException to read in a file
*/
   public static void main(String[] args) throws
      FileNotFoundException {
   
      String fileName = args[0];
      UseTaxList taxList = new UseTaxList();
      taxList.readVehicleFile(fileName);
      System.out.print("" + taxList.summary() + "\n");
      System.out.print("" + taxList.listByOwner() + "\n");
      System.out.print("" + taxList.listByUseTax() + "\n");
      System.out.print("" + taxList.excludedRecordsList()); 
   }
}