package day_34_Constructors_Encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		
		Floor f1 = new Floor(10,12);
		Carpet c1 = new Carpet(8);
		Calculator cal1 = new Calculator(f1,c1);
		
		System.out.println(cal1.getTotalCost());
		
		Calculator cal2 = new Calculator(new Floor(10,12), new Carpet(8));
		
		System.out.println(cal2.getTotalCost());
		

	}

}
