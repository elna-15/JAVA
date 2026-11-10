package Object;

public class Circle {
	double area;
	double circumferance;
	int r;
    public void Area(){
    	area=3.14*r*r;
    	
    	
    }
    public void Circumferance() {
    	circumferance=2*3.14*r;
    }
    public void display() {
    	System.out.println("Area of the circle is"+area);
		System.out.println("Circumferance of the circle is"+circumferance);
		}
    public static void main(String[] args) {
		Circle cr=new Circle();
		cr.r=2;
		cr.Area();
		cr.Circumferance();
		cr.display();
		
	}
}
