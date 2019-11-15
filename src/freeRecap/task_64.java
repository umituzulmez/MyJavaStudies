package freeRecap;

public class task_64 {

	public static void main(String[] args) {
		
		printPattern(1);
		printPattern(2);
		printPattern(3);
		printPattern(4);
		printPattern(5);

	}

	public static void printPattern(int number) {
		
		for(int i=1; i<=number; i++) {
			
			for(int i2=1; i2<=i; i2++) {
				
				System.out.print("*");
				
			}
		
		System.out.println();
	
		}
	}
}
