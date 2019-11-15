package freeRecap;

public class task_63 {

	public static void main(String[] args) {
		

		calculateCelcius(80);
		calculateCelcius(35);
		calculateCelcius(123);
		calculateCelcius(58);
		
	}
	
	public static void calculateCelcius(int fahreneit) {
		
		int celcius = (fahreneit - 32) * 5 / 9;
		
		System.out.println(fahreneit + " F " + " = " + celcius + " C ");
	}

}
