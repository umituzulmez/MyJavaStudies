package day_7controlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int score = 60;
		
		if (score>=70) {
			
			System.out.println("you passed");
		
		}else {
			
			System.out.println("you failed");
		}

		int sales,bonus;
		double commisionRate,salary;
		
		sales=5200;
		salary=10000;
		
		if(sales>5000) {
			bonus=500;
			commisionRate=1.12;
												
		}else {
			bonus=100;
			commisionRate=1.10;
			
		}
			
		
		salary=salary*commisionRate+bonus;
		
		System.out.println("Salary = " + salary);
		
		
		
	}

}
