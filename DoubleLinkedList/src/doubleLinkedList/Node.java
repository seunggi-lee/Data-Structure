package doubleLinkedList;

public class Node {
	String data;
	Node prevNode;
	Node nextNode;
	
	public Node(String data) {
		this.nextNode = null;
		this.prevNode = null;
		this.data = data;
		
	}
}
