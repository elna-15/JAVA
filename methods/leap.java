package methods;

public class leap {
 public static boolean m1(int year) {
	 if ((year%400==0)||(year%4==0 && year%100!=0)) {
	 return true;
 }
	 
	return false;
}
 public static void main(String[] args) {
	System.out.println(m1(2000));
}
}	