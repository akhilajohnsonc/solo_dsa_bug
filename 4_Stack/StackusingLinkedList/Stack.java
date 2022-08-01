package StackusingLinkedList;

public class Stack {
	LinkedList Stack;

	// time = O(1)
	// space=O(1)
	public Stack() {
		Stack = new LinkedList();

	}

	// time = O(1)
	// space=O(1)
	public void push(int value) {
		Stack.insert(value, 0);
		System.out.println("Inserted " + value + " successfully!");
	}

	// time = O(1)
	// space=O(1)
	public boolean isEmpty() {
		if (Stack.head == null) {
			return true;
		} else {
			return false;
		}
	}

	// time = O(1)
	// space=O(1)
	public int pop() {
		int result = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			result = Stack.head.value;
			Stack.delete(0);
		}
		return result;

	}

	// time = O(1)
	// space=O(1)
	public int peek() {
		int result = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			result = Stack.head.value;
		}
		return result;

	}

	// time = O(1)
	// space=O(1)
	public void deleteStack() {
		Stack.head = null;
		System.out.println("The stack is deleted");

	}

}
