package assignment6;

public class Q1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[1000];
			
		for(int i=0; i<numbers.length;)	{
		
			for(int j=0; j<10; j++) {
			
			numbers[i] = i+1;
			
			System.out.print(numbers[i] + " ");
			
			i++;
			
			}
			
			System.out.println("");
		}
	}

}
