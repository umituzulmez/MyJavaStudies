package lab4;

public class Q22 {

	public static void main(String[] args) {
		
		int[] x = {1,4,1};
		int[] y = {1,4,1,4};
		int[] z = {1,1};

		System.out.println(greater(x));
		System.out.println(greater(y));
		System.out.println(greater(z));
	}

	public static boolean greater(int[] array) {
		
		int counter1 = 0;
		int counter4 = 0;
		
		for(int value : array) {
			
			if(value==1) {
				
				counter1++;
				
			}else if(value==4) {
				
				counter4++;
			}
		}
		
		if(counter1>counter4) {
			
			return true;

		}else {
			
			return false;
		}
		
	}
}
