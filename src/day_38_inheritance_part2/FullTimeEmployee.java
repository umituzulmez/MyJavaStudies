package day_38_inheritance_part2;

public class FullTimeEmployee extends Employee{
	
	@Override //check if method is overriden
	public void calculatePay(int hours, double rate) {
		
		double total = (hours*rate) * 1.05;
		
		System.out.println("FullTimeEmployee total pay: " + total);
	}
}
