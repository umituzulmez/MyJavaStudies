package day_24_arrays_part1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
//		//nullArray
//		int[] nullArray = new int[8];
//		System.out.println(Arrays.toString(nullArray));
		
		int[] mylist = {10,20,30,40};
		
		String[] myArray = {"Apple", "Orange", "Watermelon"};
		
		System.out.println(mylist[0]);
		System.out.println(mylist[1]);
		System.out.println(mylist[2]);
		System.out.println(mylist[3]);
		
		System.out.println(mylist.length);
		System.out.println(myArray.length);
		
		
		for(int i=0; i<mylist.length; i++) {
			
			System.out.println(mylist[i]);
		}
		
		for(int i=0; i<myArray.length; i++) {
			
			System.out.println(myArray[i]);
		}

		int[] scores = {80,90,100,35,60,72,64,30,70,70};
		
		int averageScore;
		
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			
			sum = sum + scores[i];
		}
		
		averageScore = sum / scores.length;
		
		System.out.println("Sum is " + sum);
		System.out.println("Total number of array " + scores.length);
		System.out.println("Average is " + averageScore);
		
	}

}
