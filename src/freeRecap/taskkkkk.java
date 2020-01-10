package freeRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class taskkkkk {
	
	public static void main(String[] args) {
	
		int num = 13;
		boolean flag = false;
		
		for(int i=2; i<num; i++){
			
			if(num%i==0) {

				flag = true;
				
				break;
			}	
			
		}
		
		if(flag==true) {
			
			System.out.println("not prime");
		}else {
			
			System.out.println("prime");
		}
		
		
		
	}
	
}