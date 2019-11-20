package day_36_StaticClassMembers;

public class Student {
	
	String name;
	int age;
	int İdNumber;
	static String school = "Cybertek";
	
	
	public Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		İdNumber = idNumber;
		
	}


	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", İdNumber=" + İdNumber + ", school=" + school + "]";
	}
	

}
