package freeRecap;

public class task_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumEven = 0;
		int sumOdd = 0;
		int i = 1;
		
		for(i=1; i<=100; i++) {
			
			
			if(i%2!=0) {
				
				sumEven = sumEven + i;
				
				
			} else {
				
				sumOdd = sumOdd + i;
				
			}
				
		}
				System.out.println(sumEven);
				System.out.println(sumOdd);
	}

}
