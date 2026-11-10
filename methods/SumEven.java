package methods;

public class SumEven {
    public static int m1(int a) {
    	int sum=0;
    	while(a>0) {
    		int rem=a%10;
    		if(rem%2==0) {
    			sum=sum+rem;
    		}
    		a=a/10;
    	}
    	return sum;
    }
    public static void main(String[] args) {
		System.out.println(m1(1234));
	}
}
