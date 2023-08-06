package binarytree_using_Array;

public class BinaryTree {
	String[] arr;
	int lastUsedIndex;

	// time complexity : O(1)
	// space complexity : O(N)
	public BinaryTree(int size) {
		arr = new String[size + 1];
		this.lastUsedIndex = 0;
		System.out.println("Successfully created Binary Tree using Array!");
	}

	public void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.println(arr[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}

}
