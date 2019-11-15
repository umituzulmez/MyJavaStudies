package freeRecap;

public class smallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		x=0;
		y=20;
		
		if (y==20) {
			x=10;
		}
		
		System.out.println(x);
		
		////
		
		int hour=35;
		double payrate=300;
		payrate = payrate * 1.2;
		
		if (hour>40) {
			payrate = payrate * 1.5;
			
		}
		
		System.out.println(payrate);
		
		////
		
		int fee =100;
		boolean max=true;
		
		if (max) {
			fee = 50;
		}
		System.out.println(fee);
		
		///
		
		int a,b,c;
		
		a = 10;
		b = 50;
		c = 120;
		
		if (b==50 && c >= 100) {
			a = 20;
			
		}
		
		System.out.println(a);
		
		///
		
		int temperature = 65;
		
		if (temperature > 60 && temperature < 70) {
			
			System.out.println("ideal temp");
		}
		
		
	}

}
