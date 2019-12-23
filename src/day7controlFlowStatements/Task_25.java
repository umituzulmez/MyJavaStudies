package day7controlFlowStatements;

public class Task_25 {

	public static void main(String[] args) {
		

		int n1,n2,n3;
		n1=4;
		n2=8;
		n3=1;
		
		if (n2>n1 && n2>n3 ) {
			
			System.out.println("the greatest number is = " + n2);					
		}

		if (n1>n2 && n1>n3 ) {
			
			System.out.println("the greatest number is = " + n1);		
		}
		
		if (n3>n1 && n3>n2 ) {
			
			System.out.println("the greatest number is = " + n3);	
			
		}
	}

}
