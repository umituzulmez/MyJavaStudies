package lab4;

public class Q10 {

	public static void main(String[] args) {
		
		int[] x = {2,2}; 
		int[] y = {3,3}; 
		int[] a = {2,3}; 
		int[] b = {12,20,42}; 
		int[] c = {2,2,2};
		
		System.out.println(twice(x));
		System.out.println(twice(y));
		System.out.println(twice(a));
		System.out.println(twice(b));
		System.out.println(twice(c));

	}

	public static boolean twice(int[] array) {
		
		int counter2 = 0;
		int counter3 = 0;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==2) {
				
			counter2++;
		
			}if(array[i]==3) {
				
			counter3++;	
				
			}
		}
		
		if(counter2==2 || counter3==2) {
			
			return true;
			
		}else {
			
			return false;
		
		}
	}
}
