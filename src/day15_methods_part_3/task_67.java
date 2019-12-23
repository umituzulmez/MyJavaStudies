package day15_methods_part_3;

public class task_67 {

	public static void main(String[] args) {
		
		if(lastDigit(5,17)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They dont have the same last digit");
		}

	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10) == (num2%10)) {
			return true;
		
		}else {
			return false;
		}
	}

}
