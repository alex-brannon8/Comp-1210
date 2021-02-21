import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**
*Test class for the UseTaxList class.
*
*Project 10
*Alexander Brannon - COMP 1210 - 004
*11/28/17
*/
public class UseTaxListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   *Test for the readVehicleFile method.
   *@throws FileNotFoundException to read in file
   */
   @Test public void readVehicleFileTest() throws FileNotFoundException {
   
      UseTaxList taxList = new UseTaxList();
      taxList.readVehicleFile("vehicles1.txt");
   }
   /**
   *Test for the getTaxDistrict and setTaxDistrict methods.
   */
   @Test public void getandSetTaxDistrictTest() {
   
      UseTaxList taxList = new UseTaxList();
      taxList.setTaxDistrict("District 1");
      Assert.assertEquals("getandSetTaxDistrict Test", "District 1",
         taxList.getTaxDistrict());
   }
   /**
   *Test for the getVehicleList.
   */
   @Test public void getVehicleListTest() {
   
      UseTaxList taxList = new UseTaxList();
               
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
         
      taxList.addVehicle(vehicle1);
      
      Assert.assertEquals("getVehicleList Test", vehicle1,
         taxList.getVehicleList()[0]);
   }
   /**
   *Test for getExcludedRecords method.
   */
   @Test public void getExcludedRecordsTest() {
      
      UseTaxList taxList = new UseTaxList();
          
      taxList.addExcludedRecord("Firetruck, Body, Abel, 2015 GMC FE250, " 
         + "55000, false, 2.5");
      
      Assert.assertEquals("getExcludedRecords Test", "Firetruck, Body, "
         + "Abel, 2015 GMC FE250, 55000, false, 2.5",
         taxList.getExcludedRecords()[0]);
   }
   /**
   *Test for the toString method.
   */
   @Test public void toStringTest() {
   
      UseTaxList taxList = new UseTaxList();
      
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      taxList.addVehicle(vehicle1);
         
      Assert.assertEquals("toString Test", true, 
         taxList.toString().contains("Jones, Sam"));
   }
   /**
   *Test for the calculateTotalUseTax method.
   */
   @Test public void calculateTotalUseTaxTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
     
      Assert.assertEquals("calculateTotalUseTax Test", 4250.0, 
         taxList.calculateTotalUseTax(), 0.000001);
   }
   /**
   *Test for the calculateTotalValue method.
   */
   @Test public void calculateTotalValueTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
   
      Assert.assertEquals("calculateTotalValue Test", 111000.0, 
         taxList.calculateTotalValue(), 0.000001); 
   }
   /**
   *Test for the summary method.
   */
   @Test public void summaryTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
   
      Assert.assertEquals("summary Test", true,
         taxList.summary().contains("Total Value: $111,000.00"));
   }
   /**
   *Test for the listByOwner method.
   */
   @Test public void listByOwnerTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
   
      Assert.assertEquals("listByOwnerTest", true, 
         taxList.listByOwner().contains("Jones, Sam: Car"));
   }
   /**
   *Test for the listByUseTax method.
   */
   @Test public void listByUseTaxTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
   
      Assert.assertEquals("listByUseTax Test", true, 
         taxList.listByUseTax().contains("Jones, Sam"));
   }
   /**
   *Test for the excludedRecordList method.
   */
   @Test public void excludedRecordsListTest() {
   
      UseTaxList taxList = new UseTaxList();
           
      Car vehicle1 = new Car("Jones, Sam", "2017 Honda Accord", 
         22000, false);
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   
      taxList.addVehicle(vehicle1);
      taxList.addVehicle(vehicle2);
      taxList.addVehicle(vehicle3);
      taxList.addVehicle(vehicle4);
      taxList.addExcludedRecord("Firetruck, Body, Abel, " 
         + "2015 GMC FE250, 55000, false, 2.5");
      
      Assert.assertEquals("excludedRecordsList Test", true,
         taxList.excludedRecordsList().contains("Firetruck, Body"));
   }
}
