package day33_ClassesObjects_Constractors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Mike", 17, 'M', 2016, "Java", "Cybertek University");
		
		Student student2 = new Student("Smith", 25, 'M', 1999, "TS", "Cybertek University");
		
		student1.attendLecture();
		
		student2.attendLab();

	}

}
