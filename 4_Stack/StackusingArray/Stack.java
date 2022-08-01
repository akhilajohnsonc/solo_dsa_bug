package StackusingArray;

public class Stack {
	int[] arr;
	int TopOfStack;

	// time = O(1)
	// space = O(N)
	public Stack(int size) {
		this.arr = new int[size];
		this.TopOfStack = -1;
		System.out.println("Stack is created with size " + size);
	}

	// time = O(1)
	// space = O(1)
	public boolean isEmpty() {
		if (TopOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	// time = O(1)
	// space = O(1)
	public boolean isFull() {
		if (TopOfStack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// time = O(1)
	// space = O(1)
	public void push(int value) {
		if (isFull()) {
			System.out.println("The Stack is full");
		} else {
			arr[TopOfStack + 1] = value;
			TopOfStack++;
			System.out.println("Value " + value + " is successfully inserted");
		}
	}

	// time = O(1)
	// space = O(1)
	public int pop() {
		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return -1;
		} else {
			int topStack = arr[TopOfStack];
			TopOfStack--;
			return topStack;
		}
	}

	// time = O(1)
	// space = O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return -1;
		} else {
			int topStack = arr[TopOfStack];
			return topStack;
		}
	}

	// time = O(1)
	// space = O(1)
	public void delete() {
		if (isEmpty()) {
			System.out.println("The Stack is empty");
			
		} else {
			arr = null;
			TopOfStack =-1;
			System.out.println("Successfully deleted");
		}
	}
}
