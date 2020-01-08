package day46_collections_part2;

import java.util.*;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String,String> dataMap = new HashMap<>();
		
		dataMap.put("url", "qa.vrack.com");
		dataMap.put("userName", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("storemanager", "Mike Smith");
		
		//keySet ==> returns set with all the keys in the map
		//values ==> returns list with all the values in the map
		
		System.out.println("KEYS");
		
		for(String key : dataMap.keySet()) {
			System.out.print(key + "|");
		}
		
		System.out.println();
		
		System.out.print("VALUES");
		
		for(String value : dataMap.values()) {
			System.out.println(value + "|");
		}
		
		System.out.println();
		
		for(String key : dataMap.keySet()) {
			System.out.println(key + "|" + dataMap.get(key));
		}
	}

}
