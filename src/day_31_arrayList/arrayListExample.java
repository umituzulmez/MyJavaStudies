package day_31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		//Languages
		//Print size arrayList
		//Read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("English");
		languages.add("Arabic");
		languages.add("Turkish");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		languages.add("Russian");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		System.out.println("Number of values: " + languages.size());
		
		
		
		
		

	}

}
