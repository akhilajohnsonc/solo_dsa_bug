package circularDoublyLinkedList;

public class CircularDLL {
	DoublyNode head;
	DoublyNode tail;
	int size = 0;

	// time= O(1)
	// space=O(1)
	public DoublyNode createCDLL(int nodeValue) {
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		node.next = node;
		node.prev = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// time= O(N)
	// space=O(1)
	public void insertNodeCDLL(int nodeValue, int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if (head == null) {
			createCDLL(nodeValue);
			return;
		} else if (location == 0) {
			newNode.next = head;
			newNode.prev = tail;
			head.prev = newNode;
			tail.next = newNode;
			head = newNode;
		} else if (location >= size) {
			newNode.next = head;
			newNode.prev = tail;
			tail.next = newNode;
			head.prev = newNode;
			tail = newNode;
		} else {
			DoublyNode prevnode = head;
			for (int i = 0; i < location - 1; i++) {
				prevnode = prevnode.next;
			}
			newNode.prev = prevnode;
			newNode.next = prevnode.next;
			prevnode.next = newNode;
			newNode.next.prev = newNode;
		}
		size++;
	}

	// time= O(N)
	// space=O(1)
	public void TraverseCDLL() {
		if (head != null) {
			DoublyNode prevnode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(prevnode.value);
				if (i < size - 1)
					System.out.print("-->");
				prevnode = prevnode.next;
			}
			System.out.println();
		} else {
			System.out.println("CDLL does not exist!");
		}
	}

	// time= O(N)
	// space=O(1)
	public void ReverseTraverseCDLL() {
		if (head != null) {
			DoublyNode prevnode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(prevnode.value);
				if (i < size - 1)
					System.out.print("<--");
				prevnode = prevnode.prev;
			}
			System.out.println();
		} else {
			System.out.println("CDLL does not exist!");
		}
	}

	// time= O(N)
	// space=O(1)
	public boolean searchCDLL(int nodeValue) {
		if (head != null) {
			DoublyNode prevnode = head;
			for (int i = 0; i < size; i++) {
				if (prevnode.value == nodeValue) {
					System.out.println("Value exist in position " + i);
					return true;
				}
				prevnode = prevnode.next;
			}
		}
		System.out.println("Value not found");
		return false;
	}

	// time= O(N)
	// space=O(1)
	public void DeleteNodeCDLL(int location) {
		if (head != null) {
			if (location == 0) {
				if (size == 1) {
					head.prev = null;
					tail.next = null;
					head = tail = null;
					size--;
					return;
				} else {
					head = head.next;
					tail.next = head;
					head.prev = tail;
					size--;
				}
			} else if (location >= size) {
				if (size == 1) {
					head.prev = null;
					tail.next = null;
					head = tail = null;
					size--;
					return;
				} else {
					tail = tail.prev;
					tail.next = head;
					head.prev = tail;
					size--;
				}
			} else {
				DoublyNode prevnode = head;
				for (int i = 0; i < location - 1; i++) {
					prevnode = prevnode.next;
				}
				prevnode.next = prevnode.next.next;
				prevnode.next.prev = prevnode;
				size--;
			}
		} else {
			System.out.println("List does not exist!");
		}
	}
	
	// time= O(N)
	// space=O(1)
	public void deletefullCDLL() {
		DoublyNode prevnode = head;
		for (int i = 0; i < size; i++) {
			prevnode.prev=null;
			prevnode = prevnode.next;
		}
		head=null;
		tail=null;
		System.out.println("Deleted CDLL successfully!");
	}

}
