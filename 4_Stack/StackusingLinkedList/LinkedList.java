package StackusingLinkedList;
class LinkedList {
	public Node head;
	public Node tail;
	public int size;
	// time complexity = O(1)
	// Space complexity = O(1)
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// time complexity = O(N)
	// Space complexity = O(1)
	public void insert(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;

		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node prevnode = head;
			int index = 0;
			while (index < location - 1) {
				prevnode = prevnode.next;
				index++;
			}
			Node nextnode = prevnode.next;
			prevnode.next = node;
			node.next = nextnode;

		}
		size++;
	}



	// time complexity = O(N)
	// Space complexity = O(1)
	public void delete(int location) {
		if (head != null) {

			if (location == 0) {
				head = head.next;
				size--;
				if (size == 0) {
					tail = null;
				}
			} else if (location >= size) {
				int index = 1;
				Node prevnode = head;
				while (index < size - 1) {
					prevnode = prevnode.next;
					index++;
				}
				if (prevnode == head) {
					head = tail = null;
					size--;
					return;
				}
				prevnode.next = null;
				tail = prevnode;
				size--;
			} else {
				int index = 0;
				Node prevnode = head;
				while (index < location - 1) {
					prevnode = prevnode.next;
					index++;
				}
				prevnode.next = prevnode.next.next;
				size--;
			}

		} else
			System.out.println("Linked list is empty");
	}
	
	// time complexity = O(1)
	// Space complexity = O(1)
	public void sLLdelete(){
		head=null;
		tail=null;
		System.out.println("Singly linkd list deleted successfully");
	}

}