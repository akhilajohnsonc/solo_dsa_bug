package CircularQueueusingLinkedList;

public class QueueusingLinkedList {
	LinkedList list;

	public QueueusingLinkedList() {
		list = new LinkedList();
		System.out.println("Queue is successfully created!");
	}

	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int value) {
		list.insert(value, list.size);
		System.out.println("Successfully inserted " + value);
	}

	public int dequeue() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("The queue is empty");
		} else {
			value = list.head.value;
			list.delete(0);
			System.out.println("Value deleted");
		}
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		} else {
			return list.head.value;
		}
	}

	public void delete() {
		list.head = list.tail = null;
		System.out.println("Queue deleted");
	}

}
