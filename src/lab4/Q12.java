package lab4;

public class Q12 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,3};
		
		System.out.println(firstElement(x,y));
		
	}

	public static int firstElement(int[] arr1, int[] arr2) {
		
		int counter = 0;
			
			if(arr1[0] == 1) {
				
				counter++;
			
			}if(arr2[0] == 1) {
				
				counter++;	
			}
		
		return counter;
	}
}
