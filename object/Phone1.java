package Object;

public class Phone1 {
  int price;
  String color;//white
  Phone1(){
	  
  }
  Phone1(int price){
	  this.price=price;
	  
  }
  Phone1(String color){//white
	  this.color=color;//white
  }
  Phone1(int price,String color){//10,white
	  this(color);//white
	  this.price=price;//10
	  
  }
  public static void main(String[] args) {
	Phone1 p1=new Phone1(10,"White");
	Phone1 p2=new Phone1(20);
	System.out.println(p1.price);
	System.out.println(p1.color);
	System.out.println(p2.price);
}
}
