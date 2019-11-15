package day_24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task_90 {

	public static void main(String[] args) {
		
		String[] cars = { "Toyota", "Nissan", "BMW", "Mercedes", "Honda", "Porshe"};
		
		boolean flag = false;
		
		for(int i=0; i<cars.length; i++) {
			
			
			if(cars[i].equals("Honda")) {
				
				flag = true;	
				
				break;
			}
			
		}
		
		if(flag){
			
			System.out.println("I found your car Honda in this array");
			
		}else {
				
			System.out.println("I could not found your car Honda in this array");
				
			}
				
		}	
			
	}
