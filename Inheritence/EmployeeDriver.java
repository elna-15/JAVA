package Inheritence;

public class EmployeeDriver {
public static void main(String[] args) {
	
    Employee e=new Employee("Elna",123);
	
	Developer d=new Developer("BAC",200,"C");
	System.out.println(d.getlang());
	System.out.println(d.getName());
	System.out.println(e.getName());
	System.out.println(d.getSalary());
	d.setlang("Python");
	System.out.println(d.getlang());
	d.work();
	d.code();
}
}  

