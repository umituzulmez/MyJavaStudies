package day44_exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
		
		int[] nums = {36,6,34,12};
		
		//System.out.println(nums[0]); //compile time error


	
		try {
			
			System.out.println(nums[6]); //run time exception
		
		}catch(Exception e) {
		
			System.out.println("Wrong index");
		}
 
		try {
			
			int j = 100;
			int n = j / 0; //Arithmetic exception
			
		}catch(ArithmeticException e) {
			
			System.out.println("Can not / by zero");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	
	
	}
}
