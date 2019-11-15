package lab4;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int n = 2;
		
		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		
		System.out.println(Arrays.toString(notAlone(x, n)));
		System.out.println(Arrays.toString(notAlone(y, n1))); 

	}
	
	public static int[] notAlone(int[] arr, int x) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==x && arr[i-1]!=x && arr[i+1]!=x) {
				
				arr[i]=arr[i+1];
			}
		}
		
		return arr;
	}

}
