package encapsulation;

public class Students {
	  private String name; 
      private int age;
      private int yop;
     
      Students(String name){
    	  this.name=name;
    	  
      }
      Students(String name,int age){
    	  this(name);
    	  this.age=age;
      }
      Students(String name,int age,int yop){
    	  this(name,age);
    	  this.yop=yop;
      }
      public String getName() {
    	  return this.name;
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public int getAge() {
    	  return this.age;
      }
      public void setAge(int age) {
    	  this.age=age;
      }
      public int getyop() {
    	  return this.yop;
      }
      public void setyop(int yop) {
    	  this.yop=yop;
      }
      
}
