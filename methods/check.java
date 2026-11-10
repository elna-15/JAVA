package methods;
import java.util.Scanner;
public class check {
   public static void main(String[] args) {
	System.out.println("enter the input");
	Scanner sc=new Scanner(System.in);
	char value=sc.next().charAt(0);
	if(value>='a' && value<='z' || value>='A'&& value <='z') {
		System.out.println("ALPHABET");
	}
	else if (value >='0' &&value<='9') {
		System.out.println("NUMBER");
		
	}
	else {
		System.out.println("SPECIAL CHARECTOR");
	}
}
}
