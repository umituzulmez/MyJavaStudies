package day44_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		

		String str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		
		}catch(Exception e) {
			System.out.println("Enter correct index");
			return; //stops the main Method
			
		}finally {
			System.out.println("Finally block");
		}
		
			System.out.println("Hello");
		

	}

}
