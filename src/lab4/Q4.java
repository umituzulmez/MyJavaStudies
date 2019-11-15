package lab4;

public class Q4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {5,11,2};
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};		
		
		System.out.println(element(x));
		System.out.println(element(y));
		System.out.println(element(z));
		System.out.println(element(a));

	}
	
	public static int element(int[] numbers) {
		
		int sum=0;
		
		for(int value : numbers) {
		
			sum = sum + value;	
			 
		}
		
		return sum;
		
	}

}
