package Lab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int largestnum = 0;
		int smallestnum = 0;
		
		Scanner findingNumber = new Scanner(System.in);
		
		System.out.print("Enter your first number : ");
		
		int num1 = findingNumber.nextInt();
		
		System.out.print("Enter your next number : ");
		
		int num2 = findingNumber.nextInt();
		
		if(num1>num2) {
			
			largestnum = num1;
			smallestnum = num2;
			
		}else {
			
			largestnum = num2;
			smallestnum = num1;
		}
		
		
		do {
			
		System.out.print("Do you want to enter another number / 0-No, 1-Yes ");
		
		int choise = findingNumber.nextInt();
		
			if(choise == 1) {
				
				System.out.print("Enter your next number");
				
				int numNext = findingNumber.nextInt();	
				
				if(numNext>largestnum) {
					
					largestnum = numNext;
					
				}else if(numNext<smallestnum) {
					
					smallestnum = numNext;	
				}
				
			}else if(choise == 0) {
				
				break;
			}		
				
		}while(true);
		
			System.out.println("Largest Number is : " + largestnum);
			
			System.out.println("Smallest Number is : " + smallestnum);
				
		}	

	}


