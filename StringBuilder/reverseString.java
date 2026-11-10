package StringBuilder;

public class reverseString {
	public static String reV(String s) {
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString();
		
	}
 public static void main(String[] args) {

	 String s="elna";
	 System.out.println(reV(s));
}
}
