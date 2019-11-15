package assignment3;

public class Q8 {

	public static void main(String[] args) {
		
		
		char Package = 'A';
		int hour = 24; 
		double totalCharge=0;
		
		switch(Package){
		
			case 'A':
				hour = (hour - 10);
				totalCharge = 9.95 + (hour * 2.00);
				break;
			
			case 'B':
				hour = (hour - 20);
				totalCharge = 13.95 + (hour * 1.00);
				break;
				
			case 'C':
	
				totalCharge = 19.95;
				break;
				
			default:
				
				System.out.println("İnvalid Package");
				
		}
		
			System.out.println("Your monthly bill is = " + totalCharge + " $" );
			

	}

}
