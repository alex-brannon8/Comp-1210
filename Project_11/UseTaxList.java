import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
/**
*Class that reads in file and sorts vehicles.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class UseTaxList {

   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;
/**
*Constructor for the class.
*/
   public UseTaxList() {
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }
/**
*Reads in a file.
*@param fileNameIn - for the name of the file
*@throws FileNotFoundException - allows for file to be read in
*/   
   public void readVehicleFile(String fileNameIn) 
         throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      taxDistrict = scanFile.nextLine().trim();
      
      while (scanFile.hasNext()) {
         
         String line = scanFile.nextLine().trim();
         Scanner scanLine = new Scanner(line).useDelimiter(";");
         String type = scanLine.next().trim();
         String owner = scanLine.next().trim();
         String yearMakeModel = scanLine.next().trim();    
         double value = Double.parseDouble(scanLine.next().trim());   
         boolean alternativeFuel = Boolean.parseBoolean(scanLine.next().trim());
         
         switch(type.toLowerCase()) {
            
            case "car":
               
               try {
                  Car c = new Car(owner, yearMakeModel, value, 
                     alternativeFuel);
                  addVehicle(c);
               }
               catch (NegativeValueException e) {
                  String invalid = e + "in:\n" + line;
                  addExcludedRecord(invalid);
               }
               catch (NumberFormatException e) {
                  String invalid2 = e + "in:\n" + line;
                  addExcludedRecord(invalid2);
               }
               catch (NoSuchElementException e) {
                  String invalid3 = e + "in:\n" + line;
                  addExcludedRecord(invalid3);
               }
               
               break;
               
            case "truck":
               
               double tons = Double.parseDouble(scanLine.next().trim());
               try {
                  Truck t = new Truck(owner, yearMakeModel, value,
                     alternativeFuel, tons);
                  addVehicle(t);
               }
               catch (NegativeValueException e) {
                  String invalid = e + "in:\n" + line;
                  addExcludedRecord(line);
               }
               catch (NumberFormatException e) {
                  String invalid2 = e + "in:\n" + line;
                  addExcludedRecord(invalid2);
               }
               catch (NoSuchElementException e) {
                  String invalid3 = e + "in:\n" + line;
                  addExcludedRecord(invalid3);
               }
               break;
            
            case "semi":
               
               tons = Double.parseDouble(scanLine.next().trim());
               int axles = Integer.parseInt(scanLine.next().trim());
               try {
                  SemiTractorTrailer s = new SemiTractorTrailer(owner,
                     yearMakeModel, value, alternativeFuel, tons, axles); 
                  addVehicle(s);
               }
               catch (NegativeValueException e) {
                  String invalid = e + "in:\n" + line;
                  addExcludedRecord(line);
               }
               catch (NumberFormatException e) {
                  String invalid2 = e + "in:\n" + line;
                  addExcludedRecord(invalid2);
               }
               catch (NoSuchElementException e) {
                  String invalid3 = e + "in:\n" + line;
                  addExcludedRecord(invalid3);
               }
               break;
               
            case "motorcycle":
               
               double engineSize = Double.parseDouble(scanLine.next().trim());
               try {
                  Motorcycle m = new Motorcycle(owner, yearMakeModel,
                     value, alternativeFuel, engineSize);
                  addVehicle(m);
               }
               catch (NegativeValueException e) {
                  String invalid = e + "in:\n" + line;
                  addExcludedRecord(line);
               }
               catch (NumberFormatException e) {
                  String invalid2 = e + "in:\n" + line;
                  addExcludedRecord(invalid2);
               }
               catch (NoSuchElementException e) {
                  String invalid3 = e + "in:\n" + line;
                  addExcludedRecord(invalid3);
               }
               break;
            
            default:
               addExcludedRecord("Invalid Vehicle Category in: \n" 
                     + line);
               break;
         }
      }
   }
/**
*Gets the name of the tax district.
*@return the tax district
*/      
   public String getTaxDistrict() {
      return taxDistrict;
   }
/**
*Sets the name of the tax district.
*@param taxDistrictIn - for tax district
*/   
   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
/**
*Gets the array of vehicles.
*@return the array of vehicles
*/   
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }
/**
*Gets the excluded records/vehicles array.
*@return the excluded records
*/   
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
/**
*Adds a vehicle to the vehicle array.
*@param vehicleIn - for a vehicle
*/   
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList, 
         vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }
/**
*Adds a vehicle to the excluded records array.
*@param vehicleIn - for vehicle
*/   
   public void addExcludedRecord(String vehicleIn) {
      excludedRecords = Arrays.copyOf(excludedRecords, 
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = vehicleIn;
   }
/**
*Puts out the desired output.
*@return the desired output as a string.
*/   
   public String toString() {
      
      String output = "";
      int i = 0;
      while (i < vehicleList.length) {
         output += "\n" + vehicleList[i] + "\n";
         i++;
      }
      return output;
   }
/**
*Calculates the total use tax of all vehicles in the array.
*@return the total use tax
*/   
   public double calculateTotalUseTax() {
   
      double total = 0;
      int i = 0;
      while (i < vehicleList.length) {
         total += vehicleList[i].useTax();
         i++;
      }
      return total;
   }
/**
*Calculates the total value of all vehicles in the array.
*@return the total value
*/   
   public double calculateTotalValue() {
   
      double total = 0;
      int i = 0;
      while (i < vehicleList.length) {
         total += vehicleList[i].getValue();
         i++;
      }
      return total;
   }
/**
*Returns a summary of the vehicle array.
*@return the summary
*/   
   public String summary() {
      
      DecimalFormat x = new DecimalFormat("$#,##0.00");
      String output = "";
      output += "------------------------------\n";
      output += "Summary for " + getTaxDistrict() + "\n";
      output += "------------------------------\n";
      output += "Number of Vehicles: " + Vehicle.getVehicleCount() + "\n";
      output += "Total Value: " + x.format(calculateTotalValue()) + "\n";
      output += "Total Use Tax: " + x.format(calculateTotalUseTax()) + "\n\n";
      return output;
   }
/**
*Returns the array list of vehicles sorted by owner.
*@return array list by owners
*/
   public String listByOwner() {
   
      Arrays.sort(vehicleList);
      String output = "";
      for (int i = 0; i < vehicleList.length; i++) {
         output += vehicleList[i] + "\n\n";
      } 
      return "------------------------------\n" + "Vehicles "
         + "by Owner\n" + "------------------------------\n\n" 
         + output;
   }
/**
*Returns the array of vehicles sorted by use tax.
*@return array list by use tax
*/
   public String listByUseTax() {
   
      Arrays.sort(vehicleList, new UseTaxComparator());
      String output = "";
      for (int i = 0; i < vehicleList.length; i++) {
         output += vehicleList[i] + "\n\n";
      }
      return "------------------------------\n" + "Vehicles "
         + "by Use Tax\n" + "------------------------------\n\n"
         + output;
   }
/**
*Returns the array of excluded records.
*@return array of excluded records
*/
   public String excludedRecordsList() {
   
      String output = "";
      for (int i = 0; i < excludedRecords.length; i++) {
         output += excludedRecords[i] + "\n\n";
      }
      return "------------------------------\n" + "Excluded Records\n"
         + "------------------------------\n\n"
         + output;
   }
}