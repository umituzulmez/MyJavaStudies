package assignment2;

public class q4 {

	public static void main(String[] args) {
		/*Telephone Bill
Write a Java program to calculate the monthly telephone bills as per the following rule: 
Minimum $200 for up to 100 calls. 
Plus $0.60 per call for next 50 calls. 
Plus $0.50 per call for next 50 calls. 
Plus $0.40 per call for any call beyond 200 calls.
		 */

		int calls;
		double pricePerCall, totalPrice;
		
		calls = 340;
		pricePerCall = 0;
		
		totalPrice = calls * pricePerCall;
		
		if (calls<=100) {
			
			System.out.println("Your Bill is 200$");
			
		}else if (calls>100 && calls<=150) {
			pricePerCall = 0.60;
			totalPrice = ((calls - 100) * pricePerCall) + 200; 
			
		}else if (calls>150 && calls<=200) {
			pricePerCall = 0.50;
			totalPrice = ((calls - 150) * pricePerCall) + 200; 
			
		}else if (calls>200) {
			pricePerCall = 0.40;
			totalPrice = ((calls - 150) * pricePerCall) +200; 
		
		}
		
			System.out.println("Your Bill is " + totalPrice + " $");
		
	}

}

//double bill, calls;calls = 150;if (calls < 100) {    System.out.println("Your bill is minimum 200$ for up to 100 calls");} else if (calls < 150) {    bill = ((calls - 100) * 0.60) + 200;    System.out.println("Your bill is: " + bill);} else if (calls < 200) {    bill = ((calls - 150) * 0.50) + (50 * 0.60) + 200;    System.out.println("Your bill is: " + bill);} else if (calls > 200) {    bill = ((calls - 200) * 0.40) + (50 * 0.50) +(50 * 0.60) + 200;    System.out.println("Your bill is: " + bill);} else {System.out.println("Please enter valid number...");}}}