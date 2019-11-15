package Lab2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner cookieBag = new Scanner(System.in);
		
		// one cookie = 75 calorie
		
		int cookieNumber = 0;
		int caloriesConsumed = 0;
		
		System.out.print("Enter number of cookies you ate : ");
		
		cookieNumber = cookieBag.nextInt();
		
		caloriesConsumed = cookieNumber * 75;
		
		System.out.println("You ate " + cookieNumber + " cookies and consumed " + caloriesConsumed + " Calories.");
		
		
		

	}

}
