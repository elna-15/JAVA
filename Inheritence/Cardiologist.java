package Inheritence;

public class Cardiologist extends  Doctor {
  Cardiologist(String name,int age,String dept){
	  super(name,age,dept);
  }
  public static void main(String[] args) {
	Doctor d=new Doctor();
	Cardiologist c=new Cardiologist("ABC",10,"XYZ");
	System.out.println(c.age);
}
}
