package assignment6;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		char[] arr = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		
		boolean flag = false;
		
		char search = 'K';
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == search) {
				
				flag = true;
				
				break;
				
			}
	
		} 
			if(flag){
				
				System.out.println(search + " found" );
				
			}else {
				
				System.out.println(search + " not found" );
			
		}
	}

}
