package day_7controlFlowStatements;

public class Task_28 {

	public static void main(String[] args) {
		
		/*int price,quantity,revenue,discount,netrevenue;
		
		price = 100;
		quantity = 25;
		revenue = price * quantity;
		discount=0;
		netrevenue=0;
		
		if (revenue>5000) {
			
			discount=revenue * 10 / 100;
			
			netrevenue= revenue - discount;	
			
		}
		
		System.out.println("Discount is = " + discount + " Netrevenue is = " +netrevenue );
	*/
		
		double price = 100;
		int quantity =  2000;
		
		double revenue;
		double discount=0;
		
		revenue=price*quantity;
		
		if(revenue>5000) {
			
			discount = revenue*0.1;
			revenue=revenue-discount;
		}
		
		System.out.println("discount = " + discount);
		System.out.println("revenue = " + revenue);











		

	}

}
