/**
*Class for an online text item.
*
*Activity 9
*Alexander Brannon - COMP 1210 - 004
*11/12/17
*/
public abstract class OnlineTextItem extends InventoryItem {
/**
*@param nameIn - for name of text
*@param priceIn - for price of item
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
/**
*@return the price of item
*/   
   public double calculateCost() {
      return price;
   }
}