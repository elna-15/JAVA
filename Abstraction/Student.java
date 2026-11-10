package Abstraction;

import java.util.Objects;

public class Student {
	String name;
	int id;
	long phone;
	
  public Student(String name, int id, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
public int hashCode() {
	return Objects.hash(name,id,phone);
}
public String toString() {
	return this.name+" "+this.id+" "+this.phone;
}
public static void main(String[] args) {
	Student s1=new Student("abc",10,9497);
	Student s2=new Student("xyz",20,892136);
	Student s3=new Student("cde",30,123);
	Student s4=new Student("efg",40,456);
	Student s5=new Student("ghi",50,789);
	Student s6=new Student("jkl",60,143);
	Student s7=new Student("mno",70,183);
	Student s8=new Student("pqr",80,223);
	Student s9=new Student("stu",90,323);
	Student s10=new Student("vwy",100,1723);
	Student[] st= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10} ;
    for(Student s:st) {
    	System.out.println(s);
    }
}
  
}
