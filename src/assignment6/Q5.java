package assignment6;

public class Q5 {

	public static void main(String[] args) {
		
		int[] fibArray = new int[15];
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i=0; i<fibArray.length; i++) {	
			
			fibArray[i] = sum;
			
			System.out.println(fibArray[i]);
			
			a = b;
			b = sum;
			sum = a + b;
		}

	}

}
