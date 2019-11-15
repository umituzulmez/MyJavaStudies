package freeRecap;

public class task_69 {

	public static void main(String[] args) {
		
		
		int number = 44;
		
		boolean flag = isPrime(number);
		
		if(flag==true) {
			
			System.out.println(number + " is a prime number");
				
		}else {
			
			System.out.println(number + " is not a prime number");
		}

	}

	public static boolean isPrime(int number) {
		
		boolean flag = true;
		
		if(number == 0 || number == 1) {
			
			flag = false;
			
		}else {
			
			for(int i=2; i<number; i++) {
				
				if(number%i==0) {
					
					flag = false;
					
					break;
				}
			}
		}
		
		
		return flag;
		
	}

}
