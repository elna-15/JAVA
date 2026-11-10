package Abstraction;

public class CalculatorImplement extends Calculator {

	
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	
	public void pro(int a, int b) {
	
		System.out.println(a*b);
	}

	@Override
	public void div(int a, int b) {
		
		System.out.println(a/b);}
   
}
