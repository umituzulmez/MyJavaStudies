package day25_arrays_part2;

import java.util.Scanner;

public class passArray {

	public static void main(String[] args) {
		
		//create an array
		int[] numbers = new int[4];
		
		//pass the array to the getValues method
		getValue(numbers);
		
		System.out.println("Here are the numbers that you entered");
		
		//pass the array to the showArray method
		showArray(numbers);
		

	}

	public static void getValue(int[] array) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + array.length + " numbers");
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter number " + (i+1) + " :");
			array[i]= sc.nextInt();
		} 
		
	}
	
	public static void showArray(int[] array) {
		
		for(int value : array) {
			
			System.out.println(value);
		}
	}
}
