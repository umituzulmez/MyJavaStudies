package assignment3;

public class Q20 {

	public static void main(String[] args) {
		
		int c = 1;
		int d = 8;
		
		for(int a = 1; a<=8; a++) {
			
			for(int b = c; b<=d; b++) {
			
			if(b%2!=0) {
				
				System.out.print("W");
				
			}else {
				
				System.out.print("B");
			
				}
			
			}
			
			System.out.println();
			
			c++;
			d++;
			
		}	
		
	}

}

//for(int i = 1; i <= 8; i++) { //outer loop to print 8 rows    String print="";    for(int j = 1; j <= 8; j++) { //inner loop to print 8 columns in each row        if ((i + j) % 2 != 0) {            print=print+"B" + " "; //Print B when sum of i + j is odd        } else {            print=print+"W" + " "; //Print W when sum of i + j is even        }    } //inner for ends    System.out.println(print); //New line at the end of each row} //outer for ends}}