package day_10controlFlowStatementsPart_4;

public class task_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num1=50;
         int num2=10;
         int repeat=3;
         
         for(int i=1;i<=3;i++) {
             
             
             if(num1>num2) {
                 System.out.println("Number1 is greater than Num2");
             }else if(num2>num1) {
                 System.out.println("Number2 is greater than Num1");
             }else if(num1==num2) {
                 System.out.println("Num1 is equal to Num2");
             }
             
             
             
         }
	}

}
