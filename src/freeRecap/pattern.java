package freeRecap;

public class pattern {

	public static void main(String[] args) {
		
		for (int i = 4; i >= 1; i--)  {     
			
			//Printing i spaces at the beginning of each row     
			
			String y="";     
			
			for (int j = 4; j > i; j--)      {         
				
				y=y+" ";     
				
			}     
			
			//Printing i to rows value at the end of each row     
			
			String x="";     
			
			for (int j = i; j >= 1; j--)      {          
				
				x=x+j+" ";      
				
			}      
			
			System.out.println(y+x); 
			
		
		}

	}

}
