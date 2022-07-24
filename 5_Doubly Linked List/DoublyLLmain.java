package DoublyLinkedList;

public class DoublyLLmain {
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.createDLL(1);
		dll.insertDLL(2, 0);
		dll.insertDLL(3, 1);
		dll.insertDLL(4, 7);
		System.out.println(dll.head.value);
		System.out.println(dll.head.next.value);
		System.out.println(dll.head.next.next.value);
		System.out.println(dll.head.next.next.next.value);
		dll.traverseDLL();
		dll.reverseTraverseDLL();
		dll.searchDLL(3);
		dll.searchDLL(4);
		dll.searchDLL(2);
		dll.searchDLL(32);
		dll.deleteNodeDLL(1);
		dll.traverseDLL();
		dll.deleteFullDLL();
		dll.traverseDLL();
	}

}
