package assignment1;

public class q1 {

	public static void main(String[] args) {
		
		//1
		
		double gallon, litre;
		
		gallon = 125;
		litre  = gallon * 4.54609;
		
		System.out.println(gallon +" gallons are equal to " + litre + " litres.");
		
		//125.0 gallons are equal to 568.26125 litres.
		
		
		//2
		
		String MyFruit;
		
		MyFruit = "strawberry";
		
		System.out.println("My fav fruit is " + MyFruit);
		
		//My fav fruit is strawberry
		
		
		//3
		
		String MyName;
		
		MyName = "Ümit";
		
		int MyBirthYear, MyAge;
		
		MyBirthYear= 1980;
		
		MyAge = 2019 - MyBirthYear;
		
		System.out.println("Hello " + MyName + " !" + " Based on your input, your age is " + MyAge);
	
		//Hello Ümit ! Based on your input, your age is 39
		
		
		//4
		
		double height, width, area;
		
		height = 7.9;
		width = 4.5;
		area = height * width;
		
		System.out.println("The area of rectangle is " + area);
		
		//The area of rectangle is 35.550000000000004
		
		
		
		//5
		
		int Num1, Num2;
		
		Num1 = 5;
		Num2 = 7;
		
		Num1 = Num2;
		Num2 = Num1;
		
		System.out.println(Num1 + "," + Num2);
		
		//7,7
		
		
	}

}
