package day_43_poliymorphism;

public class AppleWatch extends AppleDevice{

	@Override
	public void use() {
		
		System.out.println("AppleWatch | Sport");
	}

	public void wear() {
		
		System.out.println("Wearing applewatch");
	}
}
