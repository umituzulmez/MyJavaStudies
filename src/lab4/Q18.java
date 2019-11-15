package lab4;

public class Q18 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2,1,13,2,1};
		int[] y = {1,1,5,2,8};
		int[] z = {1,2,1,13,4,5,2,1,7};
		
		System.out.println(sum(x));
		System.out.println(sum(y));
		System.out.println(sum(z));


	}

	public static int sum(int[] array) {
		
		int total = 0;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]!=13) {
			
			total = total + array[i];
			
			}else {
				
				break;
			}
			
		}
		
		return total;
		
	}
}
