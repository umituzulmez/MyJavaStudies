package Lab1;

public class Q2 {

	public static void main(String[] args) {
		
		
		love6(15,10);
		love6(16,10);
		love6(5,6);

	}
	
	public static void love6(int num1, int num2) {
		
		if(num1==6 || num2==6 || num1-num2==6 || num2-num1==6 || num1+num2==6){
			
			System.out.println(true);
	
			
		}else {
			
			System.out.println(false);
		}
	
	}

}
