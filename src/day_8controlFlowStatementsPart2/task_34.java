package day_8controlFlowStatementsPart2;

public class task_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark=76;
		char grade='?';
		
		if (mark>=90 && mark<=100) {
			grade = 'A';
		}else if (mark>=80 && mark<=89) {
			grade = 'B';
		}else if (mark>=70 && mark<=79) {
			grade = 'C';
		}else if (mark>=60 && mark<=69) {
			grade = 'D';
		}else if (mark>=0 && mark<=59) {
			grade = 'F';
		}
		
		System.out.println("Your grade is = " + grade);
		
		/////
		
		
		int math=0;
		int chemistry=70;
		int biology=10;
		
		double average= (math+chemistry+biology)/3;
		System.out.println("Average is " + average);
		
		if(average>=0 && average<=59) {
			System.out.println("Grade is F");
		}else if(average>=60 && average<=69) {
			System.out.println("Grade is D");
		}else if(average>=70 && average<=79) {
			System.out.println("Grade is C");
		}else if(average>=80 && average<=89) {
			System.out.println("Grade is B");
		}else if(average>=90 && average<=100) {
			System.out.println("Grade is A");
		}

	}

}
