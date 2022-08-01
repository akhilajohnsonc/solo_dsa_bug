package ChallengingQuestions;

public class main {
	public static void main(String[] args) {
		 LinkedList ll = new LinkedList();
		 ll.createLL(1);
		 ll.insertNode(15);
		 ll.insertNode(20);
		 ll.insertNode(3);
		 ll.insertNode(4);
		 ll.insertNode(5);
		 
		 Questions q = new Questions();
		
		 //LinkedList t= q.partition(ll, 5);
		 //t.traversalLL();
		 //q.deleteDups(ll);
		 //ll.traversalLL();
		// q.nthToLast(ll, 2);
		 LinkedList aa = new LinkedList();
		 aa.createLL(7);
		 aa.insertNode(1);
		 aa.insertNode(6);
		 
		 LinkedList bb = new LinkedList();
		 bb.createLL(5);
		 bb.insertNode(9);
		 bb.insertNode(2);
		 q.sumlists(aa, bb);
		 
		 LinkedList llA = new LinkedList();

		 llA. createLL(3);

		 llA.insertNode(1);

		 llA.insertNode(5);

		 llA.insertNode(9);

		 LinkedList llB = new LinkedList();

		 llB.createLL(2);

		 llB.insertNode(4);

		 llB.insertNode(6);

		

		 q.addSameNode(llA, llB, 7);

		 q.addSameNode(llA, llB, 2);

		 q.addSameNode(llA, llB, 1);

		 Node inter = q.findIntersection (llA, llB);

		 System.out.println(inter.value);
		
		 
	}
}
