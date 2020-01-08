package day46_collections_part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
	
		Map<String,Double> items = new HashMap<>();
		
		items.put("Apples",3.49);
		items.put("Flowers",10.99);
		items.put("Eggs",4.99);
		items.put("Cherries",6.0);
		items.put("Milk",5.0);
		items.put("Milk",4.0); // key needs to be unique

		System.out.println(items.size());
		
		System.out.println(items.get("Apples"));
		System.out.println(items.get("Milk"));
		
		System.out.println(items);
		
		System.out.println(items.isEmpty());
		
		items.remove("Flowers");
		
		System.out.println(items);
		
		System.out.println("Is Apple in the list? " + items.containsKey("Apples"));
		
		items.replace("Eggs", 2.99);
		System.out.println("Price of eggs: " + items.get("Eggs"));
		
		//increase cherry $2
		
		items.replace("Cherries",items.get("Cherries") + 2);
		
		System.out.println("Price of Cherries: " + items.get("Cherries"));
	}

}
