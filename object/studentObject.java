package Object;

public class studentObject {
    String name;
    int height;
    int weight;
    int phno;
    String email;
    public void walk() {
    	System.out.println("Walking");
    }
    public void study() {
    	System.out.println("Studying");
    }
    public void write() {
    	System.out.println("Writing");
    	
    }
    public void display() {
    	System.out.println(name);
    	System.out.println(height);
    	System.out.println(weight);
    	System.out.println(phno);
    	System.out.println(email);
    	walk();
    	study();
    	write();
    }
    public static void main(String[] args) {
		studentObject so=new studentObject();
		so.name="Elna";
		so.height=162;
		so.weight=50;
		so.phno=12345;
		so.email="elna@gmailcom";
		so.display();
	}
}
