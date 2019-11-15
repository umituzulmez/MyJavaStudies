package day_8controlFlowStatementsPart2;

public class task_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1000;
		int b = 2000;
		int c = 100;
		
		if (a>b) {
			
			if (a>c) {
				
				System.out.println(a + "is the greatest number");
				
			}else {
				
				if (b>a) {
			}
				
				if (b>c) {
					System.out.println(b + "is the greatest number");
					
				}else {
					if (c>a) {
				}
					
					if (c>b) {
						System.out.println(c + "is the greatest number");
					}
				}
			}
			
		}

	}

}
