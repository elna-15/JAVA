package methods;

public class countdigits {
	public static int m1(int a) {
		
		
		int count=0;
		while(a>0) {
			count++;
			a=a/10;
		}
		return count;
	}
		
		
		public static void main(String[] args) {
		System.out.println(m1(1235));
			
		}
	}

