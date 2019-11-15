package day_8controlFlowStatementsPart2;

public class task_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		a = 23;
		b = 54;
		c = 87;
		
		if (a>b && a>c) {
			
			System.out.println(a + " is the biggest number");
		
		}else if (b>a && b>c) {
			
			System.out.println(b + " is the biggest number");
			
		}else if (c>b && c>a) {
	
			System.out.println(c + " is the biggest number");
		
		}else {
			
			System.out.println("Numbers are equal");
		}
	}

}
