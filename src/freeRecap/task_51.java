package freeRecap;

public class task_51 {

	public static void main(String[] args) {
		
		
		int hour=0;
		int minute=0;
		int second=0;
		
		for(hour=0; hour<=23; hour++){
			
			for(minute=0; minute<60; minute++){
				
				for(second=0; second<60; second++){
				
					System.out.println(hour + ":" + minute + ":" + second);
					
				}
			
			}
			
		}
		
	}
	
}

