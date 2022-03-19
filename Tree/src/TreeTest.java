class Node{
	Object data;
	Node left;
	Node right;
	
	public Node(Object data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	public void deleteLeft() {
		this.left = null;
	}
	public void deleteRight() {
		this.right = null;
	}
	
}
class Tree{
	Node root;
	
	public Tree(Node data) {
		this.root = data;
	}
	
	public void preOrder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data + ", ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public void inOrder(Node node) {
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);
	}
	public void postOrder(Node node) {
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");
	}
}


public class TreeTest {

	public static void main(String[] args) {
		
		Node Node1 = new Node(1);
		Node Node2 = new Node(2);
		Node Node3 = new Node(3);
		Node Node4 = new Node(4);
		Node Node5 = new Node(5);
		Node Node6 = new Node(6);
		Node Node7 = new Node(7);
		
		Tree tree = new Tree(Node1);
		Node1.setLeft(Node2);
		Node1.setRight(Node3);
		
		Node2.setLeft(Node4);
		Node2.setRight(Node5);
		
		Node3.setLeft(Node6);
		Node3.setRight(Node7);
		
		System.out.print("PreOrder : ");
		tree.preOrder(Node1);
		System.out.println();
		System.out.print("InOrder : ");
		tree.inOrder(Node1);
		System.out.println();
		System.out.print("PostOrder : ");
		tree.postOrder(Node1);
		System.out.println();
		
		
		
	}

}
