package encapsulation;

public class PhoneDriver1 {
  public static void main(String[] args) {
	Phone1 p1=new Phone1("abc","xyz",100);
	System.out.println(p1.brands);
	System.out.println(p1.colors);
	System.out.println(p1.prices);
	System.out.println(p1.b1.types);
	System.out.println(p1.b1.capacitys);
	p1.createSim("airtel");
	System.out.println(p1.sim.provider);
}
}
