package assignment3;

public class Q9 {

	public static void main(String[] args) {
		
		int baseFee = 10;
		int numberOfCheque = 34;
		double amountOfCheque=0;
		
		
		if (numberOfCheque>0 && numberOfCheque<20) {
			
				amountOfCheque = numberOfCheque * 0.10;
			
		}else if (numberOfCheque>=20 && numberOfCheque<40) {
			
				amountOfCheque = numberOfCheque * 0.08;
			
		}else if (numberOfCheque>=40 && numberOfCheque<60) {
			
				amountOfCheque = numberOfCheque * 0.06;
		
		}else if (numberOfCheque>=60) {
			
				amountOfCheque = numberOfCheque * 0.04;
			
		}else {
			
			System.out.println("invalid Cheque amount");
		}

		System.out.println("Your monthly bank service fee is = " + (baseFee + amountOfCheque) + " $");
	}

}
