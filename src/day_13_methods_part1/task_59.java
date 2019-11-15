package day_13_methods_part1;

public class task_59 {

	public static void main(String[] args) {
		
		payCalculator(5,100);
		payCalculator(37, 62.5);
		
	}
	
	public static void payCalculator(double hours, double hourlyPay) {
		
		double pay = hours * hourlyPay;
		
		System.out.println("Your pay is = " + pay);
		
		
	}
	
	

}
