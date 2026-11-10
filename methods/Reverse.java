package methods;

public class Reverse {
   public static int m1(int a) {
	   int b=0;
	   
	   while(a>0) {
		  int c=a%10;
		  b=b*10+c;
          a=a/10;		  
		  
	   }
	   return b;
   }
   public static void main(String[] args) {
	System.out.println(m1(1234));
}
}
