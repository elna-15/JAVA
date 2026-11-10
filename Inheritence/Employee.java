package Inheritence;

public class Employee {
	private String name;
	private double salary;
	Employee(){
		
	}
	Employee(String name){
		this.name=name;
	}
	Employee(String name,double salary){
		this(name);
		this.salary=salary;
	}
	public void work() {
		System.out.println("I AM WORKING");
		
	}
	public String getName() {
		return this.name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
}
