package freeRecap;

public class task_62 {

	public static void main(String[] args) {
		
		calculateGreatest(9,23,56);
		calculateGreatest(6,43,12);
		calculateGreatest(642,455,656);
		calculateGreatest(56,230,546);
		

	}
	
	public static void calculateGreatest(int num1, int num2, int num3) {
		
		if(num1>num2 && num1>num3) {
			
			System.out.println("The greatest number is = " + num1);
			
		}else if(num2>num1 && num2>num3){
			
			System.out.println("The greatest number is = " + num2);
			
		}else if(num3>num1 && num3>num2){
			
			System.out.println("The greatest number is = " + num3);
			
		}else {
			
			System.out.println("The numbers are equal");
		}
		
	}

}
