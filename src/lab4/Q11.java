package lab4;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] t = {11,2,13,2,3};
		
		System.out.println(Arrays.toString(changedArray(x)));
		System.out.println(Arrays.toString(changedArray(y)));
		System.out.println(Arrays.toString(changedArray(z)));
		System.out.println(Arrays.toString(changedArray(t)));

	}
	
	public static int[] changedArray(int[] array) {
		
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]==2 && array[i+1]==3) {
				
				array[i+1]= 0;
			}
			
		}
		
			return array;
	}

}
