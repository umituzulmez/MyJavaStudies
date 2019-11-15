package lab4;

public class Q21 {

	public static void main(String[] args) {
		
		int[] x = {2,3,2,2,2,4};
		int[] y = {2,3,2,2,2,4,2,2};
		int[] z = {1,2,3,4};
		
		System.out.println(total(x));
		System.out.println(total(y));
		System.out.println(total(z));

	}

	public static boolean total(int[] array) {
		
		int sum = 0;
		
		for(int value : array) {
			
			if(value==2) {
				
			sum = sum + value;
			
			}
		}
		
		if(sum==8) {
			
			return true;
	}else {
		
		return false;
	}
}

}