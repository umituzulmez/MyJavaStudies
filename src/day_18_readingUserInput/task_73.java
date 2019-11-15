package day_18_readingUserInput;

import java.util.Scanner;

public class task_73 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int secretNumber = 11;
		int userInput;
		
		
		System.out.println("Guess the secret number between 1-20");
		
do {
			
			userInput=sc.nextInt();
			
			if(userInput<secretNumber) {
				System.out.print("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.print("Enter a smaller number:");
			}else {
				System.out.print("Congrat you got it...");
			}
			
		}while(userInput != secretNumber);






	}

}
