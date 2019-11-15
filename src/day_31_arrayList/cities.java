package day_31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Viriginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for-each loop seperated by space
		
		for(String city : cities) {
			
			System.out.println(city + " ");
			
		}
		
		System.out.println("----------------");
		
		//Print each city by using for-iterator loop
		
		for(int i=0; i<cities.size(); i++) {
			
			System.out.println(cities.get(i) + " ");
			
		}
		
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		
		System.out.println(cities.toString());
		
		System.out.println("----------------");
		
		cities.add(0,"Arlington");
		cities.add(1,"Istanbul");
		
		System.out.println(cities.toString());
		
		cities.add(2,"Ankara");
		
		System.out.println(cities.toString());
		
		int adx = cities.indexOf("Istanbul");
		System.out.println(adx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		System.out.println("----------------");
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		System.out.println(cities.toString());
		
		
		
		
		

	}

}
