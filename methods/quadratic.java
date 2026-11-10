package methods;

import java.util.Scanner;

public class quadratic {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a,b,c,d ,root1,root2;
	System.out.println("Enter a");
	a=sc.nextDouble();
	System.out.println("Enter b");
	b=sc.nextDouble();
	System.out.println("Enter c");
	c=sc.nextDouble();
	d=(b*b)-(4*a*c);
	if(d>0) {
		root1=(-b+Math.sqrt(d))/(2*a);
		root2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Rooot1 is"+root1);
		System.out.println("Root 2 is"+root2);
		
	}
	else if(d==0) {
		root1=(-b/2*a);
		System.out.println("Roots are equal");
	}
	
	else {
		System.out.println("Roots are imaginary");
	}
}
}
