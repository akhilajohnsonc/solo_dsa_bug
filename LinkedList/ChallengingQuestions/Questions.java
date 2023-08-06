package ChallengingQuestions;

import java.util.HashSet;

public class Questions {

	public void deleteDups(LinkedList ll) {
		HashSet set = new HashSet();
		Node node = ll.head;
		for (int i = 0; i < ll.size - 1; i++) {
			set.add(node.value);
			if (set.contains(node.next.value)) {
				node.next = node.next.next;
				ll.size--;
			}
			node = node.next;
		}

	}

	public Node nthToLast(LinkedList ll, int n) {
		Node node = ll.head;
		for (int i = 0; i < ll.size - n; i++) {
			node = node.next;
		}
		System.out.println(node.value);
		return node;

	}

	public LinkedList partition(LinkedList ll, int x) {
		Node searchnode = ll.head;
		ll.tail = ll.head;
		while (searchnode != null) {
			Node next = searchnode.next;
			if (searchnode.value < x) {
				searchnode.next = ll.head;
				ll.head = searchnode;
			} else {
				ll.tail.next = searchnode;
				ll.tail = searchnode;
			}
			searchnode = next;
		}
		ll.tail.next = null;

		return ll;
	}
	
	public LinkedList sumlists(LinkedList list1, LinkedList list2) {
		LinkedList result = new LinkedList();
		Node list1node = list1.head;
		Node list2node = list2.head;
		int rem = 0;
		int sum = 0;
		for(int i=0;i<list1.size;i++) {
			sum = list1node.value + list2node.value +rem;
			if(result.head == null) {
				result.createLL(sum%10);
			}
			else{
				result.insertNode(sum%10);
			}
		
			rem= sum/10;
			if(i<list1.size-1) {
			list1node = list1node.next;
			list2node = list2node.next;
			}
		}
		result.traversalLL();
		return result;
		
	}
	
	public void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
	    Node newNode = new Node();
	    newNode.value = nodeValue;
	    llA.tail.next = newNode;
	    llA.tail = newNode;
	    llB.tail.next = newNode;
	    llB.tail = newNode;

	  }

	public Node findIntersection(LinkedList llA, LinkedList llB) {
		Node node1 = llA.head;
		Node node2 = llB.head;
		LinkedList result = new LinkedList();
		while(node1!=null) {
			node2 = llB.head;
			while(node2!=null) {
				if(node1== node2) {
					if(result.head == null) {
						result.createLL(node2.value);
					}
					else{
						result.insertNode(node2.value);
					}
					
				}
				node2 = node2.next;
			
			}
			node1 = node1.next;
		}
		return result.head;
	}

	
	
	

}
