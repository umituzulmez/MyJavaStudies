package assignment3;

public class Q13 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1; 
		int n3;
		
	
		System.out.print(0 +", " + 1 + ", ");
		
		for (int i = 0 ; i<20 ;i++) {
			
			n3 = n1 + n2;
				
			System.out.print(n3 + ", ");
			
			n1 = n2;
			n2 = n3; 
			
		}
			

	}

}

//int count = 8;
//int num1 = 0, num2 = 1;
//String print="";
//
//System.out.println("Fibonacci Series of "+count+" numbers:");
//
//for (int i = 1; i <= count; ++i){
//	
//	print=print+num1+" ";
//	
//	/* On each iteration, we are assigning second number to the first number 
//	 * and assigning the sum of last two * numbers to the second number*/   
//	
//	int sumOfPrevTwo = num1 + num2;   
//	
//	num1 = num2;   
//	
//	num2 = sumOfPrevTwo;
//	
//}
//
//System.out.println(print);
//
//}
//
//}

