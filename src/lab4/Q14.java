package lab4;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		
		int[] x = {1,2}; int[] y = {3,4};  
		int[] t = {4,4}; int[] z = {2,2};
		int[] a = {9,2}; int[] b = {9,2,3,4};
		
		System.out.println(Arrays.toString(contains(x,y)));
		System.out.println(Arrays.toString(contains(t,z)));
		System.out.println(Arrays.toString(contains(a,b)));

	}
	
	public static int[] contains(int[] arr1, int[] arr2) {
		
		int[] arrtotal = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			
			arrtotal[i] = arr1[i];
		}
		
		for(int j=0; j<arr2.length; j++) {
	
			arrtotal[arr1.length + j] = arr2[j];
		}
		
		return arrtotal;
	}
//	
//	int a = 0;
//	for(int j = x.length;j<k.length;j++) {
//		
//		k[j]=y[a];
//		a++;
//	}
//	
//	System.out.println(Arrays.toString(k));
}
