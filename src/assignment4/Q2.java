package assignment4;

public class Q2 {

	public static void main(String[] args) {
		
		int a=7;
		
		while(a>2) {
			
			for(; a>=1;) {
				
				for(int b=1; b<=a; b++) {
					
					System.out.print(b);
			}
			
			System.out.println();
			
			a--;
		}
		
		a=a+2;

	}while(a<7) {
		
		for(; a<=7;) {
			
			for(int b=1; b<=a; b++) {
				
				System.out.print(b);
			}
			
			System.out.println();
			
			a++;
		}
	}

}
}
