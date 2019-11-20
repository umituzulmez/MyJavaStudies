package day_36_StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike",30,1234);
		Student s2 = new Student("Smith",35,999);
		Student s3 = new Student("Ozzy",15,001);
		
		s1.school = "Cybertek2";//changes all School name for all object because of being static
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

		System.out.println(s1.school);
		System.out.println(Student.school); //we can call directly without creating object because of being static
	}

}
