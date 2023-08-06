package CircularQueueusingLinkedList;

public class Qmain {
	public static void main(String[] args) {
		QueueusingLinkedList q = new QueueusingLinkedList();
		System.out.println(q.isEmpty());
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		q.delete();
	}

}
