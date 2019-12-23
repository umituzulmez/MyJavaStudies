package day27_arrays_part4;

public class task_95 {

	public static void main(String[] args) {
		
		int[][] scores = {
				
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
		};
		
		int sum = 0;
		
		for(int i=0; i<scores[0].length; i++) {
			
			sum = sum + scores[0][i];
		}
		
		System.out.println(sum / scores[0].length);
		
		
		int sum2 = 0;
		
		for(int j=0; j<scores.length; j++) {
			
			sum2 = sum2 + scores[j][0];
			
		}
		
		System.out.println(sum2);
	}

}
