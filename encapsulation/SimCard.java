package encapsulation;

public class SimCard {
   
	public SimCard(String provider) {
		super();
		this.provider = provider;
	}

	private String provider;
   
	 
	 
	 public String getprovider() {
		 return this.provider;
	 }

	 public void setprovider(String provider) {
		 this.provider=provider;
	 }
}
