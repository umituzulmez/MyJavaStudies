package Lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner purchase = new Scanner(System.in);
		
		System.out.print("Enter the amount of purchase : ");
		
		double amountOfPurchase = purchase.nextDouble();
		
		double stateSalesTax = 0.04;
		
		double countySalesTax = 0.02;
		
		double amountOfStateTax = amountOfPurchase * 0.04;
		
		double amountOfCountyTax = amountOfPurchase * 0.02;
		
		double amountOfTotalTax = amountOfStateTax + amountOfCountyTax;
		
		double amountOfTotalSales = amountOfPurchase + amountOfTotalTax;
		
		System.out.println("The amount of purchase         : " + amountOfPurchase + " £");
		System.out.println("The amount of state sales tax  : " + amountOfStateTax + " £");
		System.out.println("The amount of county sales tax : " + amountOfCountyTax + " £");
		System.out.println("The amount of total sales tax  : " + amountOfTotalTax + " £");
		System.out.println("The amount of total sales      : " + amountOfTotalSales + " £");

	}

}
