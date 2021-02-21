/**
*Class for an electronics item.
*
*Activity 9
*Alexander Brannon - COMP 1210 - 004
*11/12/17
*/
public class ElectronicsItem extends InventoryItem {

   protected double weight;
/**
*Shipping cost static.
*/
   public static final double SHIPPING_COST = 1.5;
/**
*@param nameIn - for name of item
*@param priceIn - for price of item
*@param weightIn - for weight of item
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
/**
*@return cost after shipping
*/   
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}