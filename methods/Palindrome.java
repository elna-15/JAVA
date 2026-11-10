package methods;

public class Palindrome {
    public static boolean m1(int a) {
    	
        int temp=a;
    	int rev=0;
    	while(a>0) {
    		int rem=a%10;
    		rev=rev*10+rem;
    		a=a/10;
    	}
    	if(rev==temp) {
			return true;
		}
    	return false;
		
    	
    }

    public static void main(String[] args) {
    	System.out.println(m1(123));
    }
		} 
