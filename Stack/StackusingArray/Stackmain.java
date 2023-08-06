package StackusingArray;

public class Stackmain {
	public static void main(String[] args) {
		Stack newStack = new Stack(2);
		System.out.println(newStack.isEmpty());
		newStack.isFull();
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		System.out.println(newStack.pop());
		System.out.println(newStack.pop());
		System.out.println(newStack.pop());
		newStack.push(4);
		newStack.push(5);
		System.out.println(newStack.peek());
		newStack.delete();
	}
}
