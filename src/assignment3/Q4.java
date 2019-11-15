package assignment3;

public class Q4 {

	public static void main(String[] args) {
		
		
		int price=99;
		int quantity=73;
		double discount=0;
		double amount=0;
		double totalAmount;
		double amountOfDiscount;
		
		amount= price * quantity;
		
		
		if(quantity>=10 && quantity<20){
			discount=0.20;
				
		}
		if(quantity>=20 && quantity<50){
			discount=0.30;
			
		}
		if(quantity>050 && quantity<100) {
			discount=0.40;
			
		}
		if(quantity>=100) {
			discount=0.50;
		}
		
		amountOfDiscount = amount * discount;
		
		totalAmount = amount - amountOfDiscount;
		
		System.out.println(amountOfDiscount);
		System.out.println(totalAmount);
		
		
	}

}

//int numberPackages=180;int packagePrice=5;double discount=0,total=0;int subTotal=0;if(numberPackages<10) {subTotal=packagePrice*numberPackages;discount=0;total=subTotal-discount;}else if(numberPackages<20) {subTotal=packagePrice*numberPackages;discount=0.2*subTotal;total=subTotal-discount;}else if(numberPackages<50) {subTotal=packagePrice*numberPackages;discount=0.3*subTotal;total=subTotal-discount;}else if(numberPackages<100) {subTotal=packagePrice*numberPackages;discount=0.4*subTotal;total=subTotal-discount;}else if(numberPackages>100) {subTotal=packagePrice*numberPackages;discount=0.5*subTotal;total=subTotal-discount;}System.out.println("SubTotal is " + subTotal);System.out.println("Discount is " + (int)discount);System.out.println("Total amount of the purchase after discount is  " +(int)total);}}
