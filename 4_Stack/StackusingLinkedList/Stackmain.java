package StackusingLinkedList;

public class Stackmain {
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.peek());
	}
}
