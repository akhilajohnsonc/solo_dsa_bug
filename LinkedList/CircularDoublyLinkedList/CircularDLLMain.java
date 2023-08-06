package circularDoublyLinkedList;

public class CircularDLLMain {

	public static void main(String[] args) {
		CircularDLL cdll = new CircularDLL();
		cdll.createCDLL(1);
		cdll.insertNodeCDLL(2, 0);
		cdll.insertNodeCDLL(10, 6);
		cdll.insertNodeCDLL(4, 1);
		cdll.TraverseCDLL();
		cdll.ReverseTraverseCDLL();
		cdll.searchCDLL(2);
		cdll.searchCDLL(100);
		cdll.DeleteNodeCDLL(0);
        cdll.TraverseCDLL();
//		cdll.DeleteNodeCDLL(1);
//		cdll.TraverseCDLL();
//		cdll.DeleteNodeCDLL(10);
//		cdll.TraverseCDLL();
        cdll.deletefullCDLL();
        cdll.TraverseCDLL();
	}
}
