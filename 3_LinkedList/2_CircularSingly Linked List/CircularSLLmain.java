package CircularSLL;

class Node {
	public int value;
	public Node next;
}

class CircularSLL {
	public Node head;
	public Node tail;
	public int size;

//time= O(1)
//space=O(1)
	public Node CreateCirsularSLL(int NodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = NodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// time complexity = O(n)
	// space complexity = O(1)
	public void insertcSLL(int nodeValue, int location) {
		Node newNode = new Node();
		newNode.value = nodeValue;
		if (head == null) {
			CreateCirsularSLL(nodeValue);
			return;
		} else if (location == 0) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		} else if (location >= size) {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		} else {
			Node prevnode = head;
			int index = 0;
			while (index < location - 1) {
				prevnode = prevnode.next;
				index++;
			}
			Node nextnode = prevnode.next;
			newNode.next = nextnode;
			prevnode.next = newNode;

		}
		size++;
	}

	// time o(n)
	// space o(1)
	public void traversecsll() {
		if (head != null) {
			Node node = head;
			for (int i = 0; i < size; i++) {
				System.out.print(node.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				node = node.next;
			}
			System.out.println();
		} else {
			System.out.println("Circular singly Linked list is empty");
		}
	}

	// time o(n)
	// space o(1)
	public boolean searchcsll(int nodeValue) {
		if (head != null) {
			Node node = head;
			for (int i = 0; i < size; i++) {
				if (node.value == nodeValue) {
					System.out.println("Found node at location " + i);
					return true;
				}
				node = node.next;
			}
		}
		System.out.println("Not found!");
		return false;

	}

//time =O(n)
//space=O(1)
	public void delete(int location) {
		if (head != null) {

			if (location == 0) {
				System.out.println("first");
				head = head.next;
				tail.next = head;
				size--;
				if (size == 0) {
					head.next = null;
					head = null;
					tail = null;
				}

			} else if (location >= size) {
				System.out.println("last");
				Node prevnode = head;
				for (int i = 0; i < size - 1; i++) {
					prevnode = prevnode.next;
				}
				if (prevnode == head) {
					head.next = null;
					head = tail = null;
					size--;
					return;
				}
				prevnode.next = head;
				tail = prevnode;
				size--;
			} else {
				System.out.println("middle");
				Node prevnode = head;
				for (int i = 0; i < location - 1; i++) {
					prevnode = prevnode.next;
				}
				prevnode.next = prevnode.next.next;
				size--;
			}
			System.out.println("Deleted");
		} else
			System.out.println("list is empty");

	}

//time =O(1)
//size = O(1)
	public void deletefulllist() {
		if (head != null) {
			head = null;
			tail.next = null;
			tail = null;
		}
		System.out.println("CSLL is deleted");

	}

}

class CircularSLLmain {

	public static void main(String[] args) {
		CircularSLL csll = new CircularSLL();
		csll.CreateCirsularSLL(3);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
		csll.insertcSLL(12, 0);
		csll.insertcSLL(13, 1);
		csll.insertcSLL(14, 6);
		csll.insertcSLL(1, 1);
		System.out.println(csll.head.value);
		System.out.println(csll.head.next.value);
		System.out.println(csll.head.next.next.value);
		System.out.println(csll.head.next.next.next.value);
		System.out.println(csll.head.next.next.next.next.value);

		csll.traversecsll();
		csll.searchcsll(3);
		csll.searchcsll(4);
		csll.delete(0);
		csll.traversecsll();
		csll.delete(1);
		csll.traversecsll();
		csll.delete(0);
		csll.traversecsll();
		csll.deletefulllist();
		csll.traversecsll();

	}

}
