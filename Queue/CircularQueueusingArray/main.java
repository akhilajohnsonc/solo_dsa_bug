package CircularQueueusingArray;

public class main {

	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(4);
		System.out.println(c.isEmpty());
		System.out.println(c.isFull());
		c.enQueue(2);
		c.enQueue(2);
		c.enQueue(2);
		c.enQueue(2);
		c.enQueue(2);
	}

}
