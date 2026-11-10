package Object;

public class Triangle {
   int s1,s2,s3;
   public void Isoceles() {
	   if((s1==s2||s2==s3||s1==s3 )&& !(s1==s2&&s2==s3)) {
		   System.out.println("Isoceles");
	   }
   }
   public void Equilateral() {
	   if(s1==s2&&s2==s3) {
		   System.out.println("Equilateral");
	   }
   }
   public void NoSideEqual() {
	   if(s1!=s2&&s2!=s3&&s3!=s1) {
		   System.out.println("No sides are equal");
	   }
   }
   public static void main(String[] args) {
	Triangle t=new Triangle();
	t.s1=3;
	t.s2=3;
	t.s3=3;
	t.Isoceles();
	t.Equilateral();
	t.NoSideEqual();
	
}
}
