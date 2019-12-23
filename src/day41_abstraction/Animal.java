package day41_abstraction;

public abstract class Animal {

	public abstract void eat();
	
	public abstract void breathe();
	
	public void move() { 	//instance method
		
		System.out.println("moving");
	}
	
}
