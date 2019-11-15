package lab4;

public class Q25 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3}; 
		int[] y = {2,3,10}; 
		
		int[] a = {1,2,3}; 
		int[] b = {2,3,5}; 
		
		System.out.println(correspond(x,y));
		System.out.println(correspond(a,b));

	}
	
	public static int correspond(int[] arr1, int[] arr2) {
		
		int counter = 0;
		
		for(int i=0; i<arr1.length; i++) {
			
			if(arr2[i]-arr1[i]<=2) {
				
				counter++;
			}
		}
		
		return counter;
	}

}
