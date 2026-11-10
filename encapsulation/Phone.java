package encapsulation;

public class Phone {
   
   private String brand;
   private String color;
   private int price;
   
   private Battery b1=new Battery("Li-ion",150);
   private SimCard sim;
   
   public Phone(String brand, String color,int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
   
   public String getbrand() {
	   return this.brand;
	   
   }
   public void setbrand(String brand) {
	   this.brand=brand;
   }
   
   public String getcolor() {
	   return this.color;
	   
   }
   public void setcolor(String color) {
	   this.color=color;
   }
   
   public int getprice() {
	   return this.price;
   }
   public void setprice(int price) {
	   this.price=price;
   }
   public void createSim(String provider) {
	   sim=new SimCard(provider);
			   
   }
public SimCard getSim() {
	return this.sim;
}
public void setSim(String provider) {
	createSim(provider);
}
public Battery getB1() {
	return this.b1;
}
public void setB1(String type,int capacity) {
	this.b1=new Battery(type,capacity);
}
}
