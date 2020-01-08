package day46_collections_part2;

import java.util.*;

public class SortStudents {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(50);
		l1.add(1);
		l1.add(5);
		l1.add(100);
		
		System.out.println(l1);
		
		Collections.sort(l1);

		System.out.println(l1);
		
		System.out.println("********************");
		
		Student s1 = new Student(15,"Mike");
		Student s2 = new Student(16,"Smith");
		Student s3 = new Student(17,"John");
		Student s4 = new Student(12,"Jimmy");
		Student s5 = new Student(11,"Necati");
		
		List<Student> slist = new ArrayList<>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		System.out.println(slist);
		
		Collections.sort(slist); 
		
		String n1 = "w";
		String n2 = "a";
		
		System.out.println(n1.compareTo(n2));
	}

}
