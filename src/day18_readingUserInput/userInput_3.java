package day18_readingUserInput;

import java.util.Scanner;

public class userInput_3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number :");
		
		int num2 = sc.nextInt();
		
		System.out.println("Enter a String :");
		
		sc.nextLine(); // important to add this line otherwise compiler does not continue to other line...
		
		String str = sc.nextLine();
		
		System.out.println("Output: " + num1 + ":" + num2 + ":" + str);
	}

}
