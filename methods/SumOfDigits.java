package methods;

public class SumOfDigits {
    public static int m1(int a) {
    	int sum=0;
    	while(a>0) {
    	int	b=a%10;
    		sum=sum+b;
    		a=a/10;
    	}
    	return sum;
    	
    }
    public static void main(String[] args) {
		System.out.println(m1(1234));
	}
}
