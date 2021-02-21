/**
*Class that is used for an Inventory Item.
*
*Activity 9
*Alexander Brannon - COMP 1210 - 004
*11/12/17
*/
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;
/**
*@param nameIn - for name of item
*@param priceIn - for price of item
*/   
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
/**
*@return name of item
*/   
   public String getName() {
      return name;
   }
/**
*@return cost after tax
*/
   public double calculateCost() {
      return price * (1 + taxRate);
   }
/**
*@param taxRateIn - for tax rate
*/   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
/**
*@return desired output
*/   
   public String toString() {
      return name + ": $" + calculateCost();
   }
   



}