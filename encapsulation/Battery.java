package encapsulation;

public class Battery {
    

	private String type;
    private int capacity;
   
    public Battery() {
    	
    }
    public Battery(String type, int capacity) {
		super();
		this.type = type;
		this.capacity = capacity;
}
    public String gettype() {
    return	this.type;
    }
    public void settype(String type) {
    	this.type=type;
    }
    public int getcapacity() {
    	return this.capacity;
    }
    public void setcapacity(int capacity) {
    	this.capacity=capacity;
    }
}