package day_23_StringManipulation_RandomClass;

import java.util.*;

public class task_84 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		for( int i=1; i<=10; i++) {
			
			Boolean b = rn.nextBoolean();
			
			if(b==true) {
				
				System.out.println("Tails");
			}else {
				
				System.out.println("Heads");
			}
		}

	}

}
