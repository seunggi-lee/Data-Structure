package deque;

public class LinkedListDeque {
	private Node front;
	private Node rear;
	
	LinkedListDeque(){
		this.front = null;
		this.rear = null;
	}
	
	void addFirst(Object data) {
		Node newNode = new Node(data);
		
		if(front == null) {
			front = newNode;
			rear = front;
			return;
		}
		Node frontNode = front;
		front = newNode;
		newNode.next = frontNode;
	}
	public void addLast(Object data) {
		Node newNode = new Node(data);
		if(rear == null) {
			rear = newNode;
			front = rear;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	public Object removeFirst() {
		Node temp = front;
		front = front.next;
		
		return temp.data;
	}
	public Object removeLast() {
		Node rearNode = rear;
		Node temp = front;
		
		while(temp != null && temp.next != rear) {
			temp = temp.next;
		}
		rear = temp;
		rear.next = null;
		return rearNode.data;
	}
	public String printAll() {
		String datas = "";
		Node temp = front;
		
		while(temp != null) {
			String val = (String) temp.data;
			temp = temp.next;
			if(temp != null)
				datas = datas + val + "  ->  ";
			else
				datas += val;
			
		}
		return datas;
		
	}
}
