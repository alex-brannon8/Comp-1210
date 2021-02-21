/**
*Holds an array of InventoryItem objects.
*
*Activity 10
*Alexander Brannon - COMP 1210 - 004
*11/17/17
*/
public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
/**
*Creates an array of inventory items.
*/   
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
/**
*Adds an element to the array.
*@param itemIn - for a new inventory item
*/   
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
/**
*Calculates the total of all the items in inventory.
*@param electronicsSurcharge - for charge of electronic items
*@return total cost of inventory
*/   
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
/**
*Creates a string with the desired output.
*@return the output of the string
*/   
   public String toString() {
   
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}