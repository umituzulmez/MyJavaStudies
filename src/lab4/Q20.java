package lab4;

public class Q20 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1,2,1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(next2(x));
		System.out.println(next2(y));
		System.out.println(next2(a));
		System.out.println(next2(b));
		
	}
	
	public static boolean next2(int[] array) {
		
		boolean flag = false;
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]==2 && array[i+1]==2) {
					
					flag = true;
					
					break;
				}
			}

			return flag;
	}

}
