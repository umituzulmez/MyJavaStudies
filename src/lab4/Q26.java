package lab4;

public class Q26 {

	public static void main(String[] args) {
		
		int x[] = {2,1,3,5};
		int y[] = {2,1,2,5}; 
		int z[] = {2,4,2,5}; 

		System.out.println(contain(x));
		System.out.println(contain(y));
		System.out.println(contain(z));

	}

	public static boolean contain(int[] array) {
		
		int oddcounter = 0 ;
		int evencounter = 0 ;
		
		for(int i=0; i<array.length-2; i++) {
			
			if(array[i]%2==0 && array[i+1]%2==0 && array[i+2]%2==0) {
				
				return true;
				
			}else if(array[i]%2==1 && array[i+1]%2==1 && array[i+2]%2==1) {
				
				return true;
			}
				
		}
		
		return false;
	}
}
