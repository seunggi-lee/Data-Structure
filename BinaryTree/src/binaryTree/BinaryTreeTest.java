package binaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.setRoot(new Node(5));
		
		Node node10 = new Node(10);
		Node node12 = new Node(12);
		Node node13 = new Node(13);
		Node node9 = new Node(9);
		Node node2 = new Node(2);
		Node node1 = new Node(1);
		
		bt.getRoot().setLeftChild(node10);
		node10.setLeftChild(node13);
		node13.setLeftChild(node1);
		
		bt.getRoot().setRightChild(node12);
		node12.setLeftChild(node9);
		node12.setRightChild(node2);
		
	}

}
