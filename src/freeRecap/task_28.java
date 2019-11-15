package freeRecap;

public class task_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int revenue, price, quantity, discount;
		
		price = 500;
		quantity = 11;
		revenue = price * quantity;
		
		if ( revenue > 5000) {
			 discount = revenue * 10 / 100;
			 revenue = revenue - discount;
			 
			 System.out.println(discount);
		}
			
			 System.out.println(revenue);
	}

}
