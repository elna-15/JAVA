package methods;

public class Returntype {
//Write a java program to print/return the addition of 2 variables
 public static int add() {
	  int a=10;
	  int b=20;
	  int c=a+b;
	  return c;
	
}
 public static void main(String[] args) {
	
	 int result=add();
	 System.out.println(result);
	 System.out.println(add());
}
}
