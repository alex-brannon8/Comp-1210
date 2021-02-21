/**
*Class for an online article.
*
*Activity 9
*Alexander Brannon - COMP 1210 - 004
*11/12/17
*/
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
/**
*@param nameIn - for name of article
*@param priceIn - for price of item
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
/**
*@param wordCountIn - for word count of article
*/   
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}