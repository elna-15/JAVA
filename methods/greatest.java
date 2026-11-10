package methods;

public class greatest { 
	public static int m1(int a,int b,int c) {
		int result=a>b&&a>c?a:b>a&&b>c?b:c; 
		return result;
	}
	public static void main(String[] args) {
		System.out.println(m1(3,5,6));
	}
}

                                                                                                                            