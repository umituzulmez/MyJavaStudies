package day18_readingUserInput;

import java.util.Scanner;

public class task_72 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		int num1 = number.nextInt();
		
		System.out.println("one more");
		
		int num2 = number.nextInt();
		
		System.out.println("one more");
		
		int num3 = number.nextInt();
		
		int total = num1 + num2 + num3;
		
		System.out.println("The total is : " + total);
		

	}

}
