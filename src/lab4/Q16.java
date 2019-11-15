package lab4;

public class Q16 {

	public static void main(String[] args) {
		
		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5};
		
		System.out.println(evenNumbers(x));
		System.out.println(evenNumbers(y));
		System.out.println(evenNumbers(z));

	}
	
	public static int evenNumbers(int[] array) {
		
		int counter = 0;
		
		for(int num : array) {
			
			if(num%2==0) {
				
				counter++;
			}
		}
		
		return counter;
	}

}
