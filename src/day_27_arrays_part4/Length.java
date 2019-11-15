package day_27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		
		int[][] numbers = {
				
				{1,2,3,4},
				{5,6},
				{9,10,11,23,30,50,60},
			
		};

		//display the number of rows
		
		System.out.println(numbers.length);
		
		//display number of column in each row
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("The number of column in row " + i + " is " + numbers[i].length);
		}
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		
		
	}

}
