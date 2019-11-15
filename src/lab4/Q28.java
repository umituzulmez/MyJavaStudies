package lab4;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {
		
		int[] fizzArray1 = {5,10}; 
		int[] fizzArray2 = {11,18}; 
		int[] fizzArray3 = {1,3}; 
		
		System.out.println(Arrays.toString(fizzArray(5,10)));
		System.out.println(Arrays.toString(fizzArray(11,18)));
		System.out.println(Arrays.toString(fizzArray(1,3)));

	}
	
	public static int[] fizzArray(int x, int y) {
		
		int[] array = new int[y-x];
		
		int j = y-x;
		
		for(int i=0; i<j; i++) {
			
			array[i] = x;
			
			x++;
		}
		
		return array;
	}

}
