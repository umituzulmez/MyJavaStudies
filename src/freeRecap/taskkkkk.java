package freeRecap;

import java.util.Arrays;
import java.util.Scanner;

public class taskkkkk {

	public static void main(String[] args) {
	
	
	String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		
	String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
	
	
		String[] bölünmüş1 = info1.split("xxx "); 
		
		System.out.println(Arrays.toString(bölünmüş1));
		
		System.out.println(bölünmüş1[8]);
		
		String[] bölünmüş2 = info2.split(" "); 
		
		System.out.println(Arrays.toString(bölünmüş2));
		
		System.out.println(bölünmüş2[8]);
		
		String[] şifre1 = bölünmüş1[8].split("xxx");
		
		System.out.println(Arrays.toString(şifre1));
		
		System.out.println(şifre1.length);
		
		System.out.println(şifre1[1]);
		
		String[] şifre2 = bölünmüş2[8].split("xxx");
		
		System.out.println(Arrays.toString(şifre2));
		
		System.out.println(şifre2.length);
		
		System.out.println(şifre2[1]);
		
		String sonŞifre = şifre1[1] + şifre2[1];
		
		System.out.println("Şifre : " + sonŞifre);
		
		System.out.println(sonŞifre);
		
		
	}
		
}