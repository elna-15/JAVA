package Arrays;

public class returnarray {
       public static  int[] m1() {
    	  int a[]= {1,2,2};
    	  return  a;
       }
       public static void main(String[] args) {
    	int [] ar=m1(); //stores the address and it points to {1,2,2} 
		for (int i = 0; i < ar .length; i++) {
			System.out.println(ar[i]);
			
		}
	}
}
