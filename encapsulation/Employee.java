package encapsulation;

public class Employee {
   private String ename;
   private String designation;
   private Department d=new Department(1,"Accounting");
   private IdCard id;
public Employee(String ename, String designation) {
	super();
	this.ename = ename;
	this.designation = designation;
}
public String getEname() {
	return this.ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesignation() {
	return this.designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
  public void createId(String cardId, String issueDate) {
	  id=new IdCard(cardId,issueDate);
  }
 public Department getdepartment() {
	 return this.d;
 }
 public void setdepartment(int deptid, String deptname) {
	this. getdepartment().setDeptid( deptid);
	this.getdepartment().setDeptname(deptname);
 }
 public IdCard getid() {
	 return this.id;
 }
 public void  setId(String cardId, String issueDate) {
	 createId(cardId,issueDate);
 }

}
  

