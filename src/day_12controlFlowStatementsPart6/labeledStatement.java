package day_12controlFlowStatementsPart6;

public class labeledStatement {

	public static void main(String[] args) {
		
		
		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
				
			} while(true);

	}

}
