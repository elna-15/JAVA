package Abstraction;

public class Phone extends Object{
	int price;
	String brand;
	public Phone(int price,String brand) {
		this.price=price;
		this.brand=brand;
	}
	public String toString() {
		return this.price+" "+this.brand;
	}
	public boolean equals(Object o) {
		Phone p=(Phone) o;
		if (this.price==p.price && this.brand==p.brand) 
		 return true;
		else {
		return false;
		} 
		
				
			
	}
    public static void main(String[] args) {
		Phone p1=new Phone(10,"abc");
//		System.out.println(p1);
		Phone p2=new Phone(20,"xyz");
//		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}
}
