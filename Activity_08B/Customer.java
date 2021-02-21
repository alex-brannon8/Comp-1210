/**
*Class that sets the name, location, and balance of a customer.
*
*Activity 8B
*Alexander Brannon - COMP - 1210 - 004
*11/6/17
*/
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;
/**
*@param nameIn - for customer name.
*/
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
/**
*@param locationIn - for location of customer.
*/   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
/**
*@param amount - added to balance to set new balance.
*/   
   public void changeBalance(double amount) {
      balance = balance + amount;
   }
/**
*@return the location of the customer.
*/   
   public String getLocation() {
      return location;
   }
/**
*@return the balance of the customer.
*/   
   public double getBalance() {
      return balance;
   }
/**
*Another way of inputing location of the customer.
*@param city - for the city of the customer.
*@param state - for the state of the customer.
*/   
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
/**
*@return the information of the customer.
*/   
   public String toString() {
      return "" + name + "\n" + location + "\n" + "$" + balance;
   }
/**
*Compares different customers' balances.
*@param obj - the name of the customer object already created.
*@return 0, 1, or -1 depending on which customer has a larger balance.
*/   
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}