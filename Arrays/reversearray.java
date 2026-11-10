package Arrays;

public class reversearray {
  public static int[] m1(int[]arr) {
	  int rev[]=new int[arr.length];
	  int length=arr.length-1;
	  for(int i=0;i<arr.length;i++) {
		 
		 
		  rev[i]=arr[length];
		  length--;
	  }
	return rev;
  }
  public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	int []rev=m1(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(rev[i]);
	}
}
}
