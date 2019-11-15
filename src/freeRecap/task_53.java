package freeRecap;

public class task_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int number = 0;
//		int sumEven = 0;
//		
//		while (number<=100) {
//			
//			if (number%2==0) {
//				
//				sumEven = sumEven + number;
//			}
//			
//			number++;
//		}
//		
//		System.out.println(sumEven);
		
		
		int num=0;
		int sumEven=0;
		
		do {
			
			if(num%2==0) {
			
			sumEven=sumEven + num;
			
			}
			
			num++;
			
		}while(num<=100);
			
		System.out.println(sumEven);
	}

}
