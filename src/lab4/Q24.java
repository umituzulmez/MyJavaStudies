package lab4;

import java.util.Arrays;

public class Q24 {

	public static void main(String[] args) {
		
		int[] x = {1,2,1,3};
		int a = 2;
		
		int[] y = {1,2,1,3};
		int b = 1;
		
		System.out.println((everywhere(x,a)));
		System.out.println((everywhere(y,b)));
		

	}

	public static boolean everywhere(int[] array, int number) {
		
		boolean flag = false;
		
		for(int i=0; i<array.length-2; i++) {
			
			if(array[i]==number && array[i+1]==number || array[i+2]==number) {
				
				flag = true;
				
			}
		}
		
		return flag;
			
	}
}
