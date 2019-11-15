package Lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner percentage = new Scanner(System.in);
		
		System.out.print("Enter the number of males in class : ");
		
		int numberOfMales = percentage.nextInt();
		
		System.out.print("Enter the number of females in class : ");
		
		int numberOfFemales = percentage.nextInt();
		
		int totalNumber = numberOfMales + numberOfFemales;
		
		double percentageOfMales = (double) numberOfMales/totalNumber;
		
		double percentageOfFemales = (double) numberOfFemales/totalNumber;
		
		System.out.println("The percentage of males in class is : " + percentageOfMales);
		
		System.out.println("The percentage of females in class is : " + percentageOfFemales);

	}

}
