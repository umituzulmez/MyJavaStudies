package day_36_StaticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("One arguement constructor");	
	}

	public AllBlocks() {
		System.out.println("No arguement constructor");
	}
	
	static {
		System.out.println("First static init");
	}
	
	{
		System.out.println("First instance init");
	}
	
	{
		System.out.println("Second instance init");
	}
	
	static {
		System.out.println("Second static init");
	}
}
