package day_13_methods_part1;

public class task_60 {

	public static void main(String[] args) {
		
		calculator(5,10,"+");
		calculator(5,10,"-");
		calculator(5,10,"*");
		calculator(5,10,"/");

	}
	
	public static void calculator(int num1, int num2, String operator) {
		
		switch(operator) {
		
			case "+":
			System.out.println(num1+num2);
			break;
			case "-":
			System.out.println(num1-num2);
			break;
			case "*":
			System.out.println(num1*num2);
			break;
			case "/":
			System.out.println(num1/num2);
			break;
		
		}
		
		
	}
		

}
