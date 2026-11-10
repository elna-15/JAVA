package encapsulation;

import java.util.Scanner;

public class Account {
	private int balance;
   Account(int balance){
    	  this.balance=balance;
   }
   
   public int getBalance(int pin) {
	   if(pin>=1000 && pin<=9999) {
		   return this.balance;
	   }
	   else {
		   return -1;
	   }
   }
  public void setBalance(int balance) {
	  this.balance+=balance;
  }
 
}
