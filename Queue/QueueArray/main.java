package queueArray;

public class main {

	public static void main(String[] args) {
		QueueArray q = new QueueArray(6);
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		q.enQueue(2);
		q.enQueue(5);
		q.enQueue(7);
		q.enQueue(7);
		System.out.println(q.deQueue());
		System.out.println(q.peek());
		q.delete();

	}

}
