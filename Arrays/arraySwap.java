package Arrays;

import java .util.Arrays;

public class arraySwap {
    public static void swap(int arr1[],int arr2[]) {
    	int temp;
    	for(int i=0;i<arr1.length;i++) {
    		temp=arr1[i];
    		arr1[i]=arr2[i];
    		arr2[i]=temp;
    	}
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
		int []arr1= {1,2,3};
		int[]arr2= {4,5,6};
		swap(arr1,arr2);
    }}