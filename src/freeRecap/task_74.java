package freeRecap;

import java.util.Scanner;

public class task_74 {

	public static void main(String[] args) {
		
		Scanner numbers = new Scanner(System.in);
		
		int num = 0; 
		
		int sum = 0; 
		
		
		while(num>=0) {
			
			System.out.println("Enter your number : ");
			
			num = numbers.nextInt();
			
		if(num>0) {
	
			sum += num;
			
			System.out.println("Your total is : " + sum);
				
		}else {
			
			break;
		}
		
		}
		
	}
	
}
		
			
	

