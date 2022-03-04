public class Main {

  //REQUIRES: array of doubles containing transaction values AND array of strings containing corresponding transaction dates in line with the array of doubles
  //MODIFIES: none
  //EFFECTS: returns the final account balance after calculating all costs and transactions
  public static double getBankAccountBalance(double A[], String D[]){  //made static to be able to use in main function as an example
    int currentMonth = 0; //used in the loop to keep track of the month
    double balance = 0; //bank account balance
    double monthlyCosts[] = new double[12]; //used to store monthly costs for each month
    int i, len = D.length; //store number of transactions (length of arrrays) in 'len' to increase execution speed
    String temp[] = new String[3]; //used to store each date for each iteration of loop
    
    for(i=0;i<len;i++){
      temp = D[i].split("-",3);
      currentMonth= Integer.parseInt(temp[1]) - 1; //obtain current month, decrement the value to access monthlyCosts array correctly
      monthlyCosts[currentMonth] += A[i]*(-1); //add the cost to the corresponding month's total
      balance += A[i]; //increase/decrease balance accordingly
      if(A[i]<0)
        balance += (A[i]*0.02)* (-1); //if the transaction was a purchase, 2% cashback is added to the balance
    }
   
    for(i=0;i<12;i++){
      if(monthlyCosts[i]<100.00) //if monthly cost was below $100.00, $9.99 charge to the account balance
        balance -= 9.99;
    }

   return Math.round(balance*100.0)/100.0; //final balance rounded to 2 decimals
  }
  
  //I've included a main function with an example to demonstrate the correctness of the function
  public static void main(String[] args) {
    String dates[] = {"2021-02-16", "2021-03-22", "2021-03-25", "2021-10-09", "2021-07-23", "2021-12-29", "2021-06-28"};
    double trans[] = {500.00,-10.99,-95.99,50.00, -124.99, 2000.00, -499.99};
    
    System.out.println(getBankAccountBalance(trans, dates)); //answer should be 1742.77
  }
}
