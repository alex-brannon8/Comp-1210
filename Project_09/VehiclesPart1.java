/**
*Driver class for the Vehicle class and all classes derived from it.
*
*Project 9
*Alexander Brannon - COMP 1210 - 004
*11/14/17
*/
public class VehiclesPart1 {

/**
*@param args - not used
*/
   public static void main(String[] args) {
   
      Car vehicle1 = new Car("Jones, Sam", "2017Honda Accord", 
         22000, false);
         
      Truck vehicle2 = new Truck("Williams, Jo", 
         "2012 Chevy Silverado", 30000, false, 1.5);
   
      SemiTractorTrailer vehicle3 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, 
         false, 5.0, 4);
         
      Motorcycle vehicle4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
   }
}