package Lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sumOfNumbers = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter a positive nonzero number : ");
		
		int number = sumOfNumbers.nextInt();
		
		if(number<1) {
			
			System.out.println("Invalid number!");
			
		}else {
			
			for(int i = 1; i<=number; i++) {
				
				sum +=number;
			}
		}

		System.out.println("The sum from 1 to " + number + " is : " + sum);
	}

}
