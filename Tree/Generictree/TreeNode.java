package Generictree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int value;
	List<TreeNode> children;

	public TreeNode(int value) {
		this.value = value;
		this.children = new ArrayList<TreeNode>();
	}

	public void addChild(TreeNode node) {
		this.children.add(node);
	}

	public int findSum() {
		int sum = this.value;
		for (TreeNode child : this.children) {
			sum += child.findSum();
		}
		return sum;
	}

	public int findHeight() {
		int height = 0;
		for (TreeNode child : this.children) {
			height = Math.max(height, child.findHeight() + 1);
		}
		return height;
	}

	public List<Integer> preOrderTraversal() {
		List<Integer> result = new ArrayList<>();
		result.add(this.value);
		for (TreeNode child : this.children) {
			result.addAll(child.preOrderTraversal());
		}
		return result;
	}

	public List<Integer> postOrderTraversal() {
		List<Integer> result = new ArrayList<>();
		for (TreeNode child : this.children) {
			result.addAll(child.postOrderTraversal());
		}
		result.add(this.value);
		return result;
	}

}
