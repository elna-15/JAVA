package encapsulation;

public class PhoneDriver {
  public static void main(String[] args) {
	Phone p1=new Phone("abc","xyz",10);
	System.out.println(p1.getbrand());
	System.out.println(p1.getcolor());
	System.out.println(p1.getprice());
	System.out.println(p1.getB1().getcapacity());
	System.out.println(p1.getB1().gettype());
	p1.setSim("Airtel");
	System.out.println( p1.getSim().getprovider());
	p1.setSim("VI");
	System.out.println(p1.getSim().getprovider());

}
}
