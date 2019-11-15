package freeRecap;

import java.util.Scanner;

public class task_72 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("Enter your first number  : ");
		
		int num1 = number.nextInt();
		
		System.out.print("Enter your second number : ");
		
		int num2 = number.nextInt();
		
		System.out.print("Enter your third number  : ");
		
		int num3 = number.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println("Total of your numbers is = " + sum);
		
		

	}

}
