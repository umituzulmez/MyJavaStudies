package freeRecap;

public class task_67 {

	public static void main(String[] args) {
		
		boolean flag = lastDigit(7,17);
		lastDigit(6,17);
		lastDigit(3,113);
		
		System.out.println(flag);
		
		
	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		boolean flag;
		
		if(num1%10 ==num2%10) {
			
			flag = true;
			
		}else {
			
			flag = false;
			
		}
			
		return flag;
		
		
		
	}

}
