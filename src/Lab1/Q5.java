package Lab1;

public class Q5 {

public static void main(String[] args) {
		
		deersPlay(70,false);
		deersPlay(95,false);
		deersPlay(95,true);

	}

		public static void deersPlay(int temp, boolean isSummer) {
			
			if(isSummer) {
				
				if(temp>=60 && temp<=100) {
					
					System.out.println(true);
					
				}else {
				
					System.out.println(false);
				}
				
			}else {
				
					if(temp>=60 && temp<=90) {
					
					System.out.println(true);
					
				}else {
					
					System.out.println(false);
			}	
		
	}

}
		
}
		

