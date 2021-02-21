/**
*Class that is used for an online text.
*
*Activity 9
*Alexander Brannon - COMP 1210 - 004
*11/12/17
*/
public class OnlineBook extends OnlineTextItem {

   protected String author;
/**
*@param nameIn - for name of text
*@param priceIn - for price of item
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
/**
*@return the desired output
*/   
   public String toString() {
   
      return name + " - " + author + ": $" + price;
   }
/**
*@param authorIn - for author of text
*/   
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}