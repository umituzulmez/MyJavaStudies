package assignment3;

public class Q5 {

	public static void main(String[] args) {
		
		
		int shipping = 570;
		int weightOfPackage = 11;
		double charge=0;
		
		
		if(shipping<500) {
			
			if(weightOfPackage<=2) {
				charge=1.10;
			
			}else if(weightOfPackage>2 && weightOfPackage<=6) {
				charge=2.20;
		
			}else if(weightOfPackage>6 && weightOfPackage<=10) {
		  		charge=3.70;
	
			}else if(weightOfPackage>10) {
		  		charge=3.80;

			}
			
		}else if(shipping>500){ 
		  
				charge=5.00;
		  
	  }	
		
		System.out.println(charge);
			
	}

}

//double shippingCharge;int userWeight=20;if(userWeight<=2) {shippingCharge=1.10;}else if(userWeight<=6) {shippingCharge=2.2;}else if(userWeight<=10) {shippingCharge=3.7;}else {shippingCharge=3.8;}System.out.println("For every 500 miles, your shipping charge will be "+ shippingCharge);}}