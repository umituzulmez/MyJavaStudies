package day_4_aritmeticOperator;

public class contribution {

	public static void main(String[] args) {
		
		/* This program calculates the amount of pay that will be contributed to 
		a retirement plan if 5%, 8% or 10% of monthly pay is withheld*/
		
		double monthlyPay=6000;
		double contribution;
		
		//Calculate and display 5% contribution
		contribution=monthlyPay*0.05;
		System.out.println("5 percent is $ " + contribution + " per month.");
		
		//Calculate and display 8% contribution
		contribution=monthlyPay*0.08;
		System.out.println("8 percent is $ " + contribution + " per month.");
		
		//Calculate and display 10% constribution
		contribution=monthlyPay*0.10;
		System.out.println("10 percent is $ " + contribution + " per month.");
		
		

	}

}
