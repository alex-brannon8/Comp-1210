/**
*Allows for the input of data on the interactions tab.
*
*Activity 3
*Alexander Brannon - COMP 1210 - 004
*9/23/17
*/
public class UserInfo
{
// instance variables

   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

// constructor
/**
*Constructs the structure of the output.
*@param firstNameIn - gives the user's first name.
*@param lastNameIn - gives the user's last name.
*/
   public UserInfo(String firstNameIn, String lastNameIn)
   {
   /**
   *Gives the set structure of the output.
   */
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }

// methods
/**
*Sets all the outputs equal to what the user wants them to be.
*@return output - gives the set output in the given structure.
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *Allows for user to input location.
   *@param locationIn - gives the user's location.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *Sets the user's age.
   *@return isSet - returns the user's given age.
   *@param ageIn - allows for user to input age.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *Sets the user's age.
   *@return age - returns the user's given age.
   */
   public int getAge() {
      return age;
   }
   /**
   *@return location - gives the location.
   */
   public String getLocation() {
      return location;
   }
   /**
   *Sets status to offline.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *Sets status to online.
   */
   public void logOn()  {
      status = ONLINE;
   }
   
   
   
}



