package day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'M';
		
		student.name = "Smith";
		student.age = 30;
		student.gender = 'M';
		
		person.eat("Steak");
		student.eat("Pizza");
		
		student.code("Java");
		//person.code("Java"); //It is unique for student class

	}

}
