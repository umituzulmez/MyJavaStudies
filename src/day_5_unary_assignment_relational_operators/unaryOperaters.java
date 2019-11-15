package day_5_unary_assignment_relational_operators;

public class unaryOperaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 10;
		int i2 = -100;
		int i3 = -(i1+i2);
		
		System.out.println("i1 =" + i1);
		System.out.println("i2 =" + i2);
		System.out.println("i3 =" + i3);
		
		boolean flag = true;
		System.out.println(!false);
		System.out.println(!!false);
		System.out.println(!!!false);
		
		int i = 10, j = 5;
		i++;
		--j;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int res = i++ + --j;
		
		
		
	}

}
