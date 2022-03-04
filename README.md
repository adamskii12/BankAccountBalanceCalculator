The program takes a set of annual transactions for a bank account and returns its balance after the year. 
It does this using the getBankAccountBalance() function, taking an array of doubles containing transaction totals along with an array of strings containing their corresponding transaction dates. 

NOTES:
  - The account is charged a $9.99 monthly fee if their purchases for the month were less than $100.00.
  - The account is awarded 2% cashback for all purchases (transactions with a value of less than 0).
  - The trans[] array of transaction values MUST have its transaction date in the SAME index in the dates[] array. For example, if a transaction of $50.00 occured on January 20th, 2021, and the value 50.00 is located in trans[5], then the date of the transaction (2021-01-20) must be located in dates[5].
