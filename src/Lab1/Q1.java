package Lab1;

public class Q1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 3);
	}
	
	public static void stringTimes(String greeting, int number) {
		
		for(int i = 0; i<number; i++)
		
		System.out.print(greeting);
		
	}

}

//stringTimes("Hi", 4);
//
//}
//
//public static void stringTimes(String string,int number) {
//	
//	String str = "";
//	
//	for(int i=0;i<number;i++) {
//		
//		str = str + string;   
//		
//	}
//	System.out.println(str);
//	
//}
