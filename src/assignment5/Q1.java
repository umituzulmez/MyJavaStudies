package assignment5;

import java.util.Scanner;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rn = new Random();
		
		System.out.println("Enter the amount of money you want to enter to the Slot machine!");
		
		int amountOfMoney = scan.nextInt();
		int totalAmount = 0;
		
		String selection = "";
		String selection1 = "";
		String selection2 = "";
		String selection3 = "";
		String answer = "";
		
		do {
			
			for(int i=1; i<=3; i++) {
		
		int selectNumber = rn.nextInt(6);
		
		if(selectNumber==0) {
			
			selection = "Cherries";
			
		}else if(selectNumber==1) {
			
			selection = "Oranges";
			
		}else if(selectNumber==2) {
			
			selection = "Plums";
			
		}else if(selectNumber==3) {
			
			selection = "Bells";
			
		}else if(selectNumber==4) {
			
			selection = "Melons";
			
		}else if(selectNumber==5) {
			
			selection = "Bars";
			
		}
		
		if(i==1) {
			
			selection1 = selection;
			
		}else if(i==2) {
			
			selection2 = selection;
			
		}else if(i==3) {
			
			selection3 = selection;
		}
		
		}
		
		System.out.println("First selection  : " + selection1);
		
		System.out.println("Second selection : " + selection2);
		
		System.out.println("Third selection  : " + selection3);
		
		System.out.println("----------------------------");
		

		
		if(selection1.equals(selection2) && selection2.equals(selection3)) {
			
			System.out.println("You won : " + (amountOfMoney*3)+ " £");
			
		}else if(selection1.equals(selection2) || selection1.equals(selection3) || selection2.equals(selection3)) {
			
			System.out.println("You won : " + (amountOfMoney*2) + " £");
			
		}else {
			
			System.out.println("You won : 0 £");
		}
		
		System.out.println("Do you want to play again? Y/?");
		
		answer = scan.next();
		
		totalAmount = totalAmount + amountOfMoney;
		
	}while(answer.equalsIgnoreCase("Y"));
		
		System.out.println("Entered amount of money : " + amountOfMoney + " £");
		
		System.out.println("Total amount of money : " + totalAmount + " £");

	}

}
