package lab4;

public class Q8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5}; 
		
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));
		
	}

	public static boolean contains(int[] array) {
		
		boolean flag = false;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==2 || array[i]==3) {
				
				flag = true;
				
				break;
				
			}
		}
		
		return flag;
	}
}
