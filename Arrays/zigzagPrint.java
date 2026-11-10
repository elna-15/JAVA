package Arrays;

import java.util.Arrays;

public class zigzagPrint {
  public static int[] print(int []arr1,int []arr2) {
	  int i=0;
	  int j=0;
	  int k=0;
	  int arr3[]=new int[arr1.length+arr2.length] ;
	  for(i=0;i<arr1.length;i++) {
		  arr3[k]=arr1[i];
		  k=k+2;
		  
	  }
	  j=1;
	  for(i=0;i<arr2.length;i++) {
		  arr3[j]=arr2[i];
		  j=j+2;
	  }
	  return arr3;
	  
  }
  public static void main(String[] args) {
	int arr1[]= {1,3,5,7};
	int arr2[]= {2,4,6,8};
	int arr3[]=print(arr1,arr2);
	System.out.println(Arrays.toString(arr3));
}
}
