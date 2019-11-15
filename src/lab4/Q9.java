package lab4;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		
		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(Double(x)));

	}

	public static int[] Double(int[] array) {
		
		int[] y = new int[2 * array.length];
		
		y[y.length-1] = array[array.length-1];
		
		return y;
		
	}
}
