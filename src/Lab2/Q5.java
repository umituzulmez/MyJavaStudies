package Lab2;

import java.util. Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner calcMeal = new Scanner(System.in);
		
		System.out.print("Enter the charge of meal : ");
		
		double chargeOfMeal = calcMeal.nextDouble();
		
		double tax = chargeOfMeal * 6.75 / 100;
		
		double totalCharge = chargeOfMeal + tax;
		
		double tip = totalCharge * 20 / 100;
		
		double bill = chargeOfMeal + tax + tip;
		
		System.out.println("Meal Charge : " + chargeOfMeal + " £");
		
		System.out.println("Tax amount  : " + tax + " £");
		
		System.out.println("Tip amount  : " + tip + " £");
		
		System.out.println("Total bill  : " + bill + " £" );
		
		
		
		
		

	}

}
