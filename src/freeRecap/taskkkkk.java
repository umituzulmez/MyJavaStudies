package freeRecap;

import java.util.*;
import java.util.Scanner;

public class taskkkkk {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    
	    System.out.println("Day 0 " + Arrays.toString(inhabitants));
	    
	    int day = 1;
	    int[] nullArray = new int[8];
	    
	    while(!Arrays.equals(inhabitants, nullArray)){
	      
	      for(int i=1; i<inhabitants.length-1; i++){
	        
	        if(inhabitants[i]==0){
	          
	          inhabitants[i-1] = inhabitants[i-1]/2;
	          inhabitants[i+1] = inhabitants[i+1]/2;
	          
	        }
	      }
	      
	      System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
	    
	      day++;
	    }
	    
	    System.out.println("---- EXTINCT ----");
	    System.out.println("........");
	  }
	}