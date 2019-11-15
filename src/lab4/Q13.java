package lab4;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		
		int[] x = {1,2}; int[] y = {3,4};	
		int[] a = {5,6}; int[] b = {3,8};
		int[] t = {1,1}; int[] z = {1,0};
		
		largestSum(x,y);
		largestSum(a,b);
		largestSum(t,z);

	}
	
	public static void largestSum(int[] arr1, int[] arr2) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int value : arr1) {
			
			sum1 = sum1 + value;
		}
		
		for(int value : arr2) {
			
			sum2 = sum2 + value;
		}
		
		if(sum1>sum2) {
			
			System.out.println(Arrays.toString(arr1));
			
		}else if(sum2>sum1)  {
			
			System.out.println(Arrays.toString(arr2));
			
		}else {
			
			System.out.println("equal");
		}
	}

}
