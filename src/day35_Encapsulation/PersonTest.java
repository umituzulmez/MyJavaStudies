package day35_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Mike", 25, 'M');
		
		System.out.println("Name : " + p1.getName() + ", Age : " + p1.getAge() + ", Gender : " + p1.gender);
		
		p1.setAge(30);
		
		System.out.println(p1.getAge());
	
		
	}

}
