package queueArray;

public class QueueArray {
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;

	// TIME = O(1);
	// SPACE = O(N)
	public QueueArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("Queue is created");
	}

	// TIME = O(1);
	// SPACE = O(1)
	public Boolean isFull() {
		if (topOfQueue == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// TIME = O(1);
	// SPACE = O(1)
	public Boolean isEmpty() {
		if (beginningOfQueue == arr.length - 1 || beginningOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	// TIME = O(1);
	// SPACE = O(1)
	public void enQueue(int value) {
		if (isFull())
			System.out.println("Queue is full");
		else if (isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted!");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted!");
		}

	}

	// TIME = O(1);
	// SPACE = O(1)
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			int result = arr[beginningOfQueue];
			beginningOfQueue++;
			if (beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			System.out.println(beginningOfQueue);
			return result;
		}

	}

	// TIME = O(1);
	// SPACE = O(1)
	public int peek() {
		if (!isEmpty()) {
			return arr[beginningOfQueue];	
		}
		else {
			System.out.println("Queue is empty");
			return -1;
		}

	}
	
	// TIME = O(1);
		// SPACE = O(1)
		public void delete() {
			arr = null;
			System.out.println("The queue is deleted");

		}

}
