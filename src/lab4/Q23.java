package lab4;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(newArray(4)));
		System.out.println(Arrays.toString(newArray(1)));
		System.out.println(Arrays.toString(newArray(10)));

	}

	public static int[] newArray(int number) {
		
		int[] array = new int[number];
		
		for(int i=0; i<array.length; i++) {
			
			array[i] = i;
		}
			
		return array;
	}
}
