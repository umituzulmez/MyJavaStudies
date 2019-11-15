package lab4;

public class Q19 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1,2,2,6,99,99,7};  
		int[] a = {1,1,6,7,2}; 		
		int[] b = {1,1,6,2}; 
		int[] c = {1,2,2,6,99,99,7,3,4}; 
		
		System.out.println(total(x));
		System.out.println(total(y));
		System.out.println(total(a));
		System.out.println(total(b));
		System.out.println(total(c));

	}
	
	public static int total(int[] array) {
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<array.length;i++) {
			
			if(boolCheckSix) {
				
				if(array[i] == 7 ) {
					
					boolCheckSix = false;
				}
				
				
			}else if(array[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + array[i];
				
				
			}
		}
		
		return sum;
		
	}
}