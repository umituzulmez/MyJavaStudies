package assignment6;

public class Q4 {

	public static void main(String[] args) {
		
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		short halfCentury = 0;
		short century = 0; 
		short doubleCentury = 0;
		
		for(short value : scores) {
			
			if(value>=50 && value<100) {
				
				halfCentury++;
				
			}else if(value>=100 && value<200) {
				
				century++;
				
		}else if(value>=200) {
			
				doubleCentury++;
			}
		}
		
		System.out.println("Number of Half-century : " + halfCentury);
		
		System.out.println("Number of Century : " + century);
		
		System.out.println("Number of Double-century : " + doubleCentury);
	}
	
}
