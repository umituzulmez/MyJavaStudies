package assignment3;

public class Q11 {

	public static void main(String[] args) {
		

		int number = 3;
		
		switch (number) {
		
		case 0: case 1: case 2:
			System.out.println("Low Number");
			break;
			
		case 3: case 4: case 5:
			System.out.println("Medium Number");
			break;
			
		default:
			System.out.println("Other Number");
		}

	}

}
