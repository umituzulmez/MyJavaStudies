package Lab1;

public class Q3 {

	public static void main(String[] args) {
		
		specialEleven(13);

	}
	
		public static void specialEleven(int number) {
		
			if((number%11==0) || (number%11==1)) {
				
				System.out.println(true);
				
			}else {
				
				System.out.println(false);
			}
			
	}

}
