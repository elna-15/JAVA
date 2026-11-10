package Arrays;
import java.util.Scanner;
public class arrayPrime {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int []arr1=new int[size];
	System.out.println("Enter the values");
	for(int i=0;i<size;i++) {
		arr1[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr1.length;i++) {
		int count=0;
		for(int j=1;j<=arr1[i];j++) {
			if(arr1[i]%j==0) {
				
				
					count++;					
				}
			}
		if(count==2) {
			System.out.println(arr1[i]);
		}
		
				}
			
   }
}

