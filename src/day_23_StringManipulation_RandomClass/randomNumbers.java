package day_23_StringManipulation_RandomClass;

import java.util.Random;

public class randomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));

		System.out.println(rn.nextInt(10)+5);
		
		System.out.println(rn.nextInt(10)-5);
	}

}
