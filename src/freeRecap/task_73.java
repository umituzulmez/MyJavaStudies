package freeRecap;

import java.util.Scanner;

public class task_73 {

	public static void main(String[] args) {

		Scanner guessingGame = new Scanner(System.in);
		
		int secretNumber = 15;
		
		int number = 0;
		
			System.out.print("Guess the secret number between 1 - 20 :");
		
		while(number!=secretNumber) {
			
			number = guessingGame.nextInt();
			
				if(number<=0 || number>20) {
					
					System.out.print("Out of range! Guess again :");
					
				}else if (number>0 && number<=20) {
					
				if(number == secretNumber) {
				
					System.out.print("Congrat! You got it :");
				
				}else if(number>secretNumber) {
				
						System.out.print("Too Large! Guess again! :");	
					
				}else if(number<secretNumber) {
				
						System.out.print("Too Small! Guess again! :");
						
					}
				}
			}	
		}
	}
	



