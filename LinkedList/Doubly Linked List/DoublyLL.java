package DoublyLinkedList;

public class DoublyLL {
	DoublyNode head;
	DoublyNode tail;
	int size;

	// time = O(1)
	// space = O(1)
	public void createDLL(int nodeValue) {
		head = new DoublyNode();
		DoublyNode Node = new DoublyNode();
		Node.value = nodeValue;
		Node.next = null;
		Node.prev = null;
		head = tail = Node;
		size = 1;
	}

	// time = O(n)
	// space = O(1)
	public void insertDLL(int nodeValue, int location) {
		DoublyNode newnode = new DoublyNode();
		newnode.value = nodeValue;
		if (head == null) {
			createDLL(nodeValue);
			return;
		} else if (location == 0) {
			newnode.next = head;
			newnode.prev = null;
			newnode.next.prev = newnode;
			head = newnode;
			size++;
		} else if (location >= size) {
			tail.next = newnode;
			newnode.prev = tail;
			newnode.next = null;
			tail = newnode;
			size++;
		} else {
			DoublyNode prevnode = head;
			for (int i = 0; i < location - 1; i++) {
				prevnode = prevnode.next;
			}
			newnode.next = prevnode.next;
			newnode.next.prev = newnode;
			newnode.prev = prevnode;
			prevnode.next = newnode;
			size++;
		}

	}

	// time = O(n)
	// space = O(1)
	public void traverseDLL() {
		if (head != null) {
			DoublyNode node = head;
			for (int i = 0; i < size; i++) {
				System.out.print(node.value);
				if (i != size - 1) {
					System.out.print("-->");
				}
				node = node.next;
			}
			System.out.println("");
		} else {
			System.out.println("List does not exist!");
		}
	}

	// time = O(n)
	// space = O(1)
	public void reverseTraverseDLL() {
		if (head != null) {
			DoublyNode node = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(node.value);
				if (i != size - 1) {
					System.out.print("<--");
				}
				node = node.prev;
			}
			System.out.println("");
		} else {
			System.out.println("List does not exist!");
		}
	}

	// time = O(n)
	// space = O(1)
	public boolean searchDLL(int searchValue) {
		if (head != null) {
			DoublyNode node = head;
			for (int i = 0; i < size; i++) {
				if (searchValue == node.value) {
					System.out.println("Value found in position " + i);
					return true;
				}
				node = node.next;
			}
		}
		System.out.println("Node not found!");
		return false;
	}

	// time = O(n)
	// space = O(1)
	public void deleteNodeDLL(int location) {
		if (head == null) {
			System.out.println("list does not exist!");
			return;
		} else if (location == 0) {
			if (size == 1) {
				head = tail = null;
				size--;
				return;
			} else {
				head = head.next;
				head.prev = null;
				size--;
			}
		} else if (location >= size) {
			if (size == 1) {
				head = tail = null;
				size--;
				return;
			} else {
				tail = tail.prev;
				tail.next = null;
				size--;
			}
		} else {
			DoublyNode prevNode = head;
			for (int i = 0; i < location - 1; i++) {
				prevNode = prevNode.next;
			}
			prevNode.next = prevNode.next.next;
			prevNode.next.prev = prevNode;
			size--;
		}
	}
	// time = O(n)
	// space = O(1)
	public void deleteFullDLL() {
		DoublyNode Node = head;
		for (int i = 0; i < size; i++) {
			Node.prev = null;
			Node = Node.next;
		}
		head = null;
		tail = null;
		System.out.println("List is deleted successfully!");
	}

}
