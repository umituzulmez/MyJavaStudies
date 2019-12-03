package day_39_finalKeyword;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("White");
		COLORS.add("Blue");
		
		//COLORS = new ArrayList<String>(); //You cannot do this because reference is final
		COLORS.add("Yellow");
		
		

	}

}
