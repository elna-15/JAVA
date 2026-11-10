package Arrays;

public class binarySearch {

public static int m1(int []arr,int target) {
	int left=0;
	
	int right=arr.length-1;
	while(left<=right) {
		int mid=(left+right)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]>target) {
			right=mid-1;
			
		}
		else {
			left=mid+1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90};
		System.out.println(m1(arr,70                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ));
		
}}
