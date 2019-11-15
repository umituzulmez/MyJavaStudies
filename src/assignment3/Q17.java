package assignment3;

public class Q17 {

	public static void main(String[] args) {
		
		for(int a = 1; a<=7; a++) {
			
			for(int b = 1; b<=a; b++) {
				
				System.out.print(a); 
			}
			
			System.out.println();
		}

	}

}

//for (int i = 1; i <= 7; i++) { //outer loop for 7 rows    String print="";    for(int j = 1; j <= i; j++) { //inner loop        print=print+i;    }    System.out.println(print);}}}