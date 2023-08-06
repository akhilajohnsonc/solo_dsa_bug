package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	BinaryNode root;

	public BinaryTreeLL() {
		this.root = null;
	}

	// Root node --> left subtree --> Right Subtree
	// preorder traversal
	// time complexity O(N)
	// space complexity O(N)
	public void preorder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preorder(node.left); // o(N/2)
		preorder(node.right);// o(N/2)
	}

	// left subtree --> Root node --> Right Subtree
	// inorder traversal
	// time complexity O(N)
	// space complexity O(N)
	public void inorder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inorder(node.left); // o(N/2)
		System.out.print(node.value + " ");
		inorder(node.right);// o(N/2)
	}

	// left subtree --> Right Subtree --> Root node
	// inorder traversal
	// time complexity O(N)
	// space complexity O(N)
	public void postorder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postorder(node.left); // o(N/2)
		postorder(node.right);// o(N/2)
		System.out.print(node.value + " ");
	}

	public void levelorder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		System.out.println();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print("Node is " + presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			} else if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}

	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if (node.value == value) {
				System.out.println("Found!");
				return;
			} else {
				if (node.left != null) {

					queue.add(node);
				}

				if (node.right != null) {
					queue.add(node);
				}
			}

		}

		System.out.println("Value not found!");
	}

	// insert method
	void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if (root == null) {
			root = newNode;
			System.out.println("Inserted new node at Root");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println("Successfully Inserted left");
				break;
			} else if (presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Successfully Inserted right");
				break;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}

	}
}
