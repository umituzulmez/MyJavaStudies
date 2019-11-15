package day_4_aritmeticOperator;

public class discount {

	public static void main(String[] args) {
		
		int regularPrice = 59;
        double discount;
        double salesPrice;
        
        discount = regularPrice * 0.2; //you must write this not in percentage
        salesPrice = regularPrice - discount;
        
        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Sale Price: $" + salesPrice);
        
        
	}

}
