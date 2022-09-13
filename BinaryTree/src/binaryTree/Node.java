package binaryTree;

public class Node {
	private Node left = null;
	private Node right = null;
	private int value;
	
	public Node(int val) {
		this.value = val;
		
	}
	public Node(int val, Node left, Node right) {
		this.value = val;
		this.left = left;
		this.right = right;
	}
	
	public void setLeftChild(Node node) {
		this.left = node;
	}
	public void setRightChild(Node node) {
		this.right = node;
	}
	
}
