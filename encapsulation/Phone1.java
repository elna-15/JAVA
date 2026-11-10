package encapsulation;

public class Phone1 {
    String brands;
    String colors;
    int prices;
    Battery1 b1=new Battery1("li",20);
    SimCard1 sim;
    Phone1(String brands,String colors,int prices){
    	this.brands=brands;
    	this.colors=colors;
    	this.prices=prices;
    }
    public void createSim(String provider) {
    	sim=new SimCard1(provider);
    }
}
