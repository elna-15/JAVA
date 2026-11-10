package encapsulation;

public class EmployeeDriver {
public static void main(String[] args) {
	Employee e=new Employee("Elna","Tax");
	System.out.println(e.getEname());
	System.out.println(e.getDesignation());
	e.setEname("Siya");
	System.out.println(e.getEname());
	System.out.println(e.getdepartment().getDeptid());
	System.out.println(e.getdepartment().getDeptname());
	e.setdepartment(8,"finance" );
	System.out.println(e.getdepartment().getDeptid());
	System.out.println(e.getdepartment().getDeptname());
	e.createId("005","21-dec-05");
	System.out.println(e.getid().getCardId());
	System.out.println(e.getid().getissueDate());
	e.setId("006","22-jan");
	System.out.println(e.getid().getCardId());
	System.out.println(e.getid().getissueDate());
}
}
