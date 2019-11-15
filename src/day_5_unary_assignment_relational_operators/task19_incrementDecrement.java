package day_5_unary_assignment_relational_operators;

public class task19_incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;

		int result = --a + a++ + a-- + a++;
		
		//a= 49 + 49 + 50 + 49;

		System.out.println("a = " + a);
		System.out.println("result = " + result);
		
		/////
		int a1= 1;

		a1 = -a1-- + a1++ / -a1-- * --a1;

		//a= -1 + 0 / -1 * -1;

		System.out.println(a1);

		
		////
		int x = 4;
		int y = x * 4 - x++;

		// y = 4 * 4 - 4
		
		System.out.println(y);
		System.out.println(x);
	}

}
