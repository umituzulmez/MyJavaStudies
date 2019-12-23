package day43_poliymorphism;

public class IPad extends AppleDevice{

	@Override
	public void use() {
		
		System.out.println("IPad | Readbook");
	}
	
	public void draw() {
		
		System.out.println("Drawing shapes using ipad");
	}
	
	

}
