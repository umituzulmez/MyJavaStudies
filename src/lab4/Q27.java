package lab4;

public class Q27 {

	public static void main(String[] args) {
		
		int[] x = {1,4,5,6,2}; 
		int[] y = {1,2,3}; 
		int[] z = {1,2,4,5,8,9}; 
		
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}

	public static boolean contains(int[] array) {
		
		boolean flag = false;
		
		for(int i=0; i<array.length-2; i++) {
			
			if(array[i+2]==array[i+1]+1 && array[i+1]+1==array[i]+2) {
				
				flag = true;
				
			}
		}
		
		return flag;
		
	}
}
