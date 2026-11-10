package Inheritence;

public class Developer extends Employee{
  private String programming_language;
 
  Developer(){
	  
  }
  Developer(String programming_language){
	  this.programming_language=programming_language;
  }
  Developer(String name,double salary,String programming_language){
	
	  super(name,salary);
	  this.programming_language=programming_language;
	  
  }
	  
  
  public void code() {
	  System.out.println("I am writing code");
}
  public String getlang() {
	  return this.programming_language;
  }
  public void setlang(String programming_language) {
	  this.programming_language=programming_language;
  }
  
  
  
}