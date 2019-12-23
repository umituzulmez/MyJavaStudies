package day26_arrays_part3;

import java.util.Random;
import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(3,"Honda"));
		

	}
	
	public static String[] createArray(int arraySize) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] carArray = new String[arraySize];
		
		for(int i=0; i<carArray.length; i++) {
			
			System.out.print("Please enter your car #" + (i+1) + " :");
			
			carArray[i]= scan.next();
			
		}
		
		return carArray;
		
	}

	public static boolean findCar(int value, String toFindCar) {
		
		
		for(String car : createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				
				return true;	
			}
				
		}
		
			return false;
		
		
	}
}
