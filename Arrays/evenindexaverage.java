package Arrays;

public class evenindexaverage {
   public static void main(String[] args) {
	int arr[]= {2,4,5,6};
	float temp=0;
	float count=0;
	
	for(int j=0;j<arr.length;j=j+2) {
		temp+=arr[j];
		count++;
		
	}
	float avg=temp/count;
	System.out.println(avg);
}}

