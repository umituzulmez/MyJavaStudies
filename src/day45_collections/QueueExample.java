package day45_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<>();
		
		qu.add("Mike");
		qu.add("Smith");
		qu.add("John");
		qu.add("Tom");
		
		System.out.println(qu);
		
		String name = qu.remove();
		System.out.println(name);
		
		System.out.println(qu);
		
		name = qu.poll();
		
		System.out.println(qu);
		
		name = qu.peek();
		System.out.println(name);
	}

}
