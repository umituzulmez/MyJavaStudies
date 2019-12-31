package freeRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class taskkkkk {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		timesTwo(nums);
	}
	//create your method below
	
	public static void timesTwo(ArrayList<Integer> nums){
	  ArrayList<Integer> newNums = new ArrayList<>();
	  
	  for(int i=0; i<nums.size(); i++){
		  
		  nums.set(i,nums.get(i)*2);
	  }
	  System.out.println(nums);
	}
	
}