package methods;

public class ProductOfDigits {
   public static int m1(int a) {
	   int pro=1;
	   while(a>0) {
		   int b=a%10;
		   pro=pro*b;
		   a=a/10;
				
	   }
	   return pro;
   }
   public static void main(String[] args) {
	System.out.println(m1(1234));
}
}
