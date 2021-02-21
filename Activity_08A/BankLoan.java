/**
*Class that calculates different factors of a bankloan.
*
*Activity 8
*Alexander Brannon - COMP 1210 - 004  
*10/30/17
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
/**
*@param customerNameIn is customer name
*@param interestRateIn is interest rate
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
/**
*@param amount is borrowing amount
*@return loan amount
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**
*@param amountPaid is amount paid from loan
*@return the new balance
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
/**
*@return the balance
*/   
   public double getBalance() {
      return balance;
   }
/**
*@param interestRateIn is the interest rate
*@return interest rate
*/   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*@return the interest rate
*/   
   public double getInterestRate() {
      return interestRate;
   }
/**
*charge interest.
*/   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
/**
*@return output
*/   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
/**
*@param amount the loan amount
*@return the result
*/   
   public static boolean isAmountValid(double amount) {
      boolean result = false;
      if (amount >= 0) {
         result = true;
      } 
      else {
         result = false;
      }
      return result;
   }
/**
*@param loan the loan amount
*@return result
*/   
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
/**
*@return how many loans created
*/   
   public static int getLoansCreated() {
      return loansCreated;
   }
/**
*Resets the loans created.
*/   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
