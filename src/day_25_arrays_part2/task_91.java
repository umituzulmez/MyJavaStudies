package day_25_arrays_part2;

import java.util.Random;

public class task_91 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int[] elements = new int[10];
		
		for(int i=0; i<elements.length; i++) {
			
			elements[i]=rn.nextInt(100);
			
			System.out.println(elements[i]);
		}

	}

}
