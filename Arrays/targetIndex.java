package Arrays;

import java.util.Scanner;

public class targetIndex {
  public static void print(int[] arr1,int t) {
	
	
	int i;
	for( i=0;i<arr1.length;i++) {
		if(arr1[i]==t) {
			System.out.println("INDEX IS " +i);
		}
	}
}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int[]arr1= new int[5];
	  System.out.println("Enter the array");
	  for(int i=0;i<5;i++) {
		  arr1[i]=sc.nextInt();
	  }
	  System.out.println("Enter the target");
	  int target=sc.nextInt();
	print(arr1,target);
}
}
