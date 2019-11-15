package assignment3;

public class Q18 {

	public static void main(String[] args) {
		
		int c = 4;
		int e = 1;
		
		for(int a = 1; a<=4; a++) {
					
			for(int b = c; b>=1; b--) {
				
				System.out.print(b + " ");
				
			}
			
			System.out.println();
			
			c--;
			
			for(int d = e; d>0; d--) {
	
				System.out.print(" ");
			
			}
			
			e++;
		}
		
	}

}

//for (int i = 4; i >= 1; i--)  {     
//	
//	//Printing i spaces at the beginning of each row     
//	
//	String y="";     
//	
//	for (int j = 4; j > i; j--)      {         
//		
//		y=y+" ";     
//		
//	}     
//	
//	//Printing i to rows value at the end of each row     
//	
//	String x="";     
//	
//	for (int j = i; j >= 1; j--)      {          
//		
//		x=x+j+" ";      
//		
//	}      
//	
//	System.out.println(y+x); 
//	
//
//}