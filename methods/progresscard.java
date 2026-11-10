package methods;

import java.util.Scanner;

public class progresscard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); {
	    System.out.println("Enter marks");
	    int marks=sc.nextInt();
	    if(marks>90) {
	    	System.out.println("GRADE:A");
	    }
	    else if(marks>80 && marks<=90)
	    {
	    	System.out.println("GRADE:B");
	    }
	    else if(marks>70 && marks<=80)
	    {
	    	System.out.println("GRADE:C");
	    }
	    else if(marks>60 && marks<=70)
	    {
	    	System.out.println("GRADE:D");
	    }
	    else if(marks>=50 && marks<=60)
	    {
	    	System.out.println("GRADE:E");
	    }
	    else {
	    	System.out.println("Failed");
	    }
	    
		   }
	}
	
   
}
