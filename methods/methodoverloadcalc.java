package methods;

public class methodoverloadcalc {
    public static void add(int a,int b) {
    	System.out.println( +a+ " + " +b+ " = " +(a+b));
    }
    public static void add(int a,int b,int c) { 
    	System.out.println(+a+ " + " +b+ " + " +c+ "="+(a+b+c));
    	
    }
    public static void add(int a,int b,int c,int d) {
    	System.out.println(+a+ " + " +b+ " + " +c+ " + " +d+ "="+(a+b+c+d));
    	
    }
    public static void sub(int a,int b) {
    	System.out.println( +a+ " - " +b+ " = " +(a-b));
    }
    public static void sub(int a,int b,int c) {
    	System.out.println(+a+ " - " +b+ " - " +c+ "="+(a-b-c));
    	;
    	
    }
    public static void sub(int a,int b, int c,int d) {
    	System.out.println(+a+ " - " +b+ " - " +c+ " - " +d+ "="+(a-b-c-d));
    	
    }
    public static void mul(int a,int b) {
    	System.out.println( +a+ " * " +b+ " = " +(a*b));
    }
    public static void mul(int a,int b,int c) {
    	System.out.println(+a+ " * " +b+ " * " +c+ "="+(a*b*c));
    }
    public static void mul(int a,int b,int c ,int d) {
    	System.out.println(+a+ " * " +b+ " * " +c+ " * " +d+ "="+(a*b*c*d));
    }
    public static void div(int a,int b) {
    	System.out.println(( +a+ " / " +b+ " = " +(a/b)));
    }
    public static void div(int a,int b,int c) {
    	System.out.println(+a+ " / " +b+ " / " +c+ "="+((a/b)/c));
    }

    public static void div(int a,int b,int c,int d) {
    	System.out.println(+a+ " / " +b+ " / " +c+ " / " +d+ "="+((a/b)/(c/d)));
    }


    public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		sub(20,10);
		sub(30,20,10);
		sub(40,30,20,10);
		mul(2,3);
		mul(3,4,2);
		mul(1,2,3,4);
		div(4,2);
		div(30,10,3);
		div(10,2,5,1);
	}
}
