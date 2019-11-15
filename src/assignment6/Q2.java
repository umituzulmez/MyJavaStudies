package assignment6;

public class Q2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			
			numbers[i] = (i+1) * 19;
		}
		
		for(int value : numbers) {
			
			System.out.println(value);
		}

	}

}
