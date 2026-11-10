package Exceptions;

public class PasswordException  {
	public static void main(String[] args) {
		
	System.out.println("main start");
    int password=2135;
    try {
    	if(password!=1234) {
    		throw new CustomException();
    	}
    }
    catch(CustomException e){
    	e.printStackTrace();
    }
   System.out.println("main ends");
    }
}
