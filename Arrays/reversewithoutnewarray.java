 package Arrays;

public class reversewithoutnewarray {
public static int[] m1(int []a) {
	 int len=a.length-1;
	for(int i=0;i<len;i++) {
		a[i]=a[len];
		len--;
	}
	return a;
}
 public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	int []rev=m1(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(rev[i]);
	}
}
}
