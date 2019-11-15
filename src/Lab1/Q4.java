package Lab1;

public class Q4 {

public static void main(String[] args) {
		
		result(60,false);
		result(65,false);
		result(65,true);
		
	}

		public static void result(int speed, boolean isBirthday) {
			
			if(isBirthday) {
				
				if (speed<=65) {
					System.out.println(0); 
					
				}else if (speed>65 && speed<=85) {
					System.out.println(1);
					
				}else if (speed>85) {
					System.out.println(2);	
					}
				
			}else {
				
				if (speed<=60) {
					System.out.println(0); 
					
				}else if (speed>60 && speed<=80) {
					System.out.println(1);
					
				}else if (speed>80) {
					System.out.println(2);	
				}
				
			}
		}	
	}
		

