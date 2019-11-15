package lab4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};  
		int[] y = {17,12,10,8};  
		int[] a = {7,0,0};
		
		System.out.println(Arrays.toString(rotateLeft(x)));
		System.out.println(Arrays.toString(rotateLeft(y)));
		System.out.println(Arrays.toString(rotateLeft(a)));

	}
	
	public static int[] rotateLeft(int[] numbers) {
		
		int x = numbers[0];
		
		for(int i=0; i<numbers.length-1; i++) {
			
			numbers[i]= numbers[i+1];	
				
		}
		
		numbers[numbers.length-1] = x;	
		
		return numbers;
	
		
	}

}
