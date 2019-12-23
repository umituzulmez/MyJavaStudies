package day8_controlFlowStatementsPart2;

public class task_36Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a =5;
		b=10;
		
		String operator = "*";
		int res=0;
		
		switch (operator) {
			
			case "+":
				res = a + b;
				break;
				
			case "-":
				res = a-b;
				break;
				
			case "*":
				res = a*b;
				break;
				
			case "/":
				res = a/b;
				break;
				
			default:
				System.out.println("Invalid Operator");
				
				
		}
		
				System.out.println("Result is = " + res);

	}

}
