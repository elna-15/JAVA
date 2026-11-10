package Exceptions;

public class CustomException extends Exception {
  CustomException(){
	  System.out.println("Exception Occured");
  }
 // @Override
  public String getMessage() {
	  return "invalid message";
  }
  //@Override
  public  void printStackTrace() {
	  super.printStackTrace();
  }
  
  
}
