package circularLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {
	private int size;
	private Node head;
	private Node tail;
	
	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0; 
	}
	
	public Node search(int idx) {
		if(size <= idx)
			throw new IndexOutOfBoundsException();
		
		Node tempNode = head;
		
		for(int i = 0; i < idx; i++) {
			tempNode = tempNode.nextNode;
		}
		return tempNode;
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			newNode.nextNode = null;
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		Node lastNode = search(size - 1);
		
		newNode.nextNode = head;
		head = newNode;
		tail.nextNode = head;
		size++;
	}
	public void addLast(String data) {
		if(size == 0) {
			addFirst(data);
		}
		Node newNode = new Node(data);
		
		tail.nextNode = newNode;
		tail = newNode;
		tail.nextNode = head;
		size++;
		
	}
	public void add(String data, int idx) {
		if(idx == 0) {
			addFirst(data);
		}
		if(idx == size - 1)
			addLast(data);
		if(idx < 0)
			throw new IndexOutOfBoundsException();
		
		Node newNode = new Node(data);
		Node prevNode = search(idx - 1);
		Node nextNode = prevNode.nextNode;
		
		prevNode.nextNode = newNode;
		newNode.nextNode = nextNode;
		size++;
		
	}
	public String removeFirst() {
		if(size == 0) {
			throw new NoSuchElementException();
		}
		if(size == 1) {
			Node temp = head;
			
			head.nextNode = null;
			tail.nextNode = null;
			
			return temp.data;
		}
		Node temp = head;
		head = head.nextNode;
		tail.nextNode = head;
		size--;
		
		return temp.data;
	}
	public String removeLast() {
		if(size == 0) {
			throw new NoSuchElementException();
		}
		if(size == 1) {
			removeFirst();
		}
		
		Node temp = tail;
		Node prevNode = search(size - 2);
		
		prevNode.nextNode = head;
		tail = prevNode;
		size--;
		return temp.data;
	}
	
	public String remove(int idx) {
		if(idx < 0 || size <= idx)
			throw new IndexOutOfBoundsException();
		if(idx == 0)
			removeFirst();
		if(idx == size - 1)
			removeLast();
		
		Node tempNode = search(idx);
		Node prevNode = search(idx - 1);
		Node nextNode = tempNode.nextNode;
		
		tempNode.nextNode = null;
		prevNode.nextNode = nextNode;
		
		return tempNode.data;
	}
	public void printAll() {
		StringBuilder sb = new StringBuilder();
		Node temp = head; 
		while(temp.nextNode != head) {
			sb.append(temp.data);
			sb.append(" <===> ");
			temp = temp.nextNode;
		}
		sb.append(temp.data);
		System.out.println(sb.toString());
	}
}
