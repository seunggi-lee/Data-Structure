package doubleLinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
	Node head;
	int size;
	
	public DoubleLinkedList() {
		this.head = null;
		this.size = 0;
	}
	public Node search(int idx) {
		if(idx >= size)
			throw new NoSuchElementException();
		Node tempNode = head;
		
		for(int i = 0; i < idx; i++) {
			tempNode = tempNode.nextNode;
		}
		
		return tempNode;
	}
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(size == 0) {
			newNode.prevNode = null;
			newNode.nextNode = null;
			
			head = newNode;
			size++;
			return;
		}
		newNode.nextNode = head;
		head.prevNode = newNode;
		newNode.prevNode = null;//의미없음
		head = newNode;
		
		size++;
	}
	public void addLast(String data) {
		if(size == 0)
			addFirst(data);
		
		Node newNode = new Node(data);
//		Node prevNode = search(size - 1);
		Node lastNode = search(size-1);
		
		newNode.prevNode = lastNode;
		lastNode.nextNode = newNode;
		newNode.nextNode = null; //의미없음
		
		size++;
		
	}
	public void add(int idx, String data) {
		if(idx >= size || idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		if(idx == 0) {
			addFirst(data);
		}
		
		Node newNode = new Node(data);
		Node prevNode = search(idx - 1);
		Node nextNode = prevNode.nextNode;
		
		prevNode.nextNode = newNode;
		newNode.prevNode = prevNode;
		newNode.nextNode = nextNode;
		nextNode.prevNode = newNode;
		size++;
		
	}
	
	public String removeFirst() {
		if(size == 0) {
			throw new NoSuchElementException();
		}
		
		Node temp = head;
		head = head.nextNode;
		head.prevNode = null;
		
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
		
		Node lastNode = search(size - 1);
		Node prevNode = lastNode.prevNode;
		
		prevNode.nextNode = null;
		lastNode.prevNode = null;
		
		size--;
		return lastNode.data;
	}
	public String remove(int idx) {
		if(idx < 0 || size  <= idx)
			throw new IndexOutOfBoundsException();
		if(idx == 0)
			removeFirst();
		if(idx == size - 1){
			removeLast();
		}
		Node temp = search(idx);
		Node prevNode = temp.prevNode;
		Node nextNode = temp.nextNode;
		
		temp.prevNode = null;
		temp.nextNode = null;
		
		prevNode.nextNode = nextNode;
		nextNode.prevNode = prevNode;
		
		size--;
		return temp.data;
	}
	public void printAll() {
		StringBuilder sb = new StringBuilder();
		Node temp = head; 
		while(temp.nextNode != null) {
			sb.append(temp.data);
			sb.append(" <===> ");
			temp = temp.nextNode;
		}
		sb.append(temp.data);
		System.out.println(sb.toString());
	}
}
