package lab4;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4}; 
		
		System.out.println(Arrays.toString(modified(x)));	

	}

	public static int[] modified(int[] arr) {
		
		int[] newArr = new int[arr.length];
		
//		for(int i=0; i<arr.length; i++) {
			
			newArr = arr;
			
//		}
		
		newArr[0] = arr[arr.length-1];
		
		newArr[newArr.length-1] = arr[0];
		
		return newArr;
		
	}
}
