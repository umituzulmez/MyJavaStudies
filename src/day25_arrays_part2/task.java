package day25_arrays_part2;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		RainFall(months);
		
		double sum;
		
		sum = RainFall(months);
		
		System.out.println("Total Rainfall for the year is : " + sum);
		
		
	}
	
	public static double RainFall(String[] array) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter in the following rainfall for the months ahead: ");
		
		System.out.println("Month   : Rainfall (In inches)");
		
		double totalRainFallInches = 0;
		
		for(int i=0; i<array.length; i++) {
			
			System.out.print(array[i] + " : ");
			
			double rainfallInches = scan.nextDouble();
			
			totalRainFallInches = totalRainFallInches + rainfallInches;
			
			
		}
		
		return totalRainFallInches;
	}
	
	public static void average(double sum) {
		
		double averageRainfall = 0;
		
		
//		averageRainfall = RainFall(sum) / 12;
		

		 
		}
	}


