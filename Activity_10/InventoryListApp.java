/**
*Driver class for the ItemsList class.
*
*Activity 10
*Alexander Brannon - COMP 1210 - 004
*11/27/17
*/
public class InventoryListApp {
/**
*@param args - not used.
*/
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.print(myItems.toString() + "\n");
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}