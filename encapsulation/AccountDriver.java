package encapsulation;

import java.util.Scanner;

public class AccountDriver {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter 4 digit pin");
	 int pin=sc.nextInt();
	Account a1=new Account(5000);
	System.out.println(a1.getBalance(pin));
	a1.setBalance(2000);
	System.out.println(a1.getBalance(pin));
}
}
