package day45_collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> numStack = new Stack<>();
		
		numStack.add(50);
		numStack.push(60);
		numStack.push(70);
		
		System.out.println(numStack);
		
		//check value on top of stack
		System.out.println(numStack.peek());
		
		//read value on top of stack then remove it
		System.out.println(numStack.pop());
		
		System.out.println(numStack);

	}

}
