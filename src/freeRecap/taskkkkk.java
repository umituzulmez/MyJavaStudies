package freeRecap;

import java.util.Arrays;
import java.util.Scanner;

public class taskkkkk {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	   
	   int num2 = num;
	   String reversedNum = "";
	   while(num2>0){
	     
	     reversedNum += num2%10;
	     num2 = num2/10;
	   }
	    
	    int newNum = Integer.parseInt(reversedNum);
	    
	    System.out.println(num==newNum);
	  }
	}