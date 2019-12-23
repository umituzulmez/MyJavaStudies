package day31_arrayList;

import java.util.ArrayList;

public class arrayListIntro {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assigning values to ArrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("Emmy");
		names.add("Evan");
		names.add("Marry");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Names count: " + nums.size());
		
		System.out.println(names.toString());
		
		
	}

}
