package Arrays;

public class maximumElementArray {
  public static void m1() {
	  int []arr= {10,12,15,11};
	  int largest=arr[0];
	  for( int i=0;i<arr.length;i++) {
		  if(arr[i]>largest) {
			  largest=arr[i];
		  }
	  }
	  System.out.println("Largest is "+largest);
  }
  public static void main(String[] args) {
	m1();
}
}
