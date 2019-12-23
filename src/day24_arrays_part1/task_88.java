package day24_arrays_part1;

import java.util.Random;

import java.util.Scanner;

public class task_88 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rn = new Random();
		
		String[] cars = new String[7];
		
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porshe";
		cars[6] = "Ferrari";
		
		System.out.print("Select your dream car : ");
		
		int carNumber = scan.nextInt();
		int carPrice = 0;
		
		if(carNumber==0 || carNumber==1 || carNumber==2) {
			
			carPrice = rn.nextInt((40000-20000)+1) + 20000;
			
		}else if(carNumber==3 || carNumber==4) {
			
			carPrice = rn.nextInt((80000-50000)+1) + 50000;
			
		}else if(carNumber==5 || carNumber==6) {
			
			carPrice = rn.nextInt((150000-100000)+1) + 100000;
		}
		
		System.out.println("Your dream car is : " + cars[carNumber]); 
		System.out.println("Its price is : " + carPrice );
		

	}

}
