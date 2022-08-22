/*전반적으로 이해가 안가는 것은 아니지만 
 * 아직 이해가 뭔가 아쉬우니까 검색을 통해서 추가 공부하기
 * 스트링 빌더도 공부하기*/

package linkedListTest;

import java.util.NoSuchElementException;

public class SinglLinkedList{
	private Node head;
	int size = 0;
	
	public SinglLinkedList() {
		this.head = null;
	}
	public Node search(int idx) {
		if(idx < 0 || size <= idx)
			throw new IndexOutOfBoundsException();
		
		Node temp = head;
		for(int i = 0; i<idx; i++) {
			temp = temp.nextNode;
		}
		return temp; 
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			newNode.nextNode = null;
			head = newNode;
			size++;
			return;
		}
		newNode.nextNode = head;
		head = newNode;
		size++;
	}
	public void addLast(String data) {
		if(size == 0) {
			addFirst(data);
		}
		Node newNode = new Node(data);
		
		Node temp = head;
		for(int i = 0; i < size - 1; i++) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNode;
		size++;
	}
	public void add(String data, int idx) {
		if(idx == 0) {
			addFirst(data);
		}
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
		Node temp = head;
		head = head.nextNode;
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
		Node prevNode = search(size - 2);
		prevNode.nextNode = null;
		size--;
		return lastNode.data;
	}
	public String remove(int idx) {
		if(size == 0)
			throw new NoSuchElementException();
		if(size <= idx) {
			throw new IndexOutOfBoundsException();
		}
		Node tempNode = search(idx - 1);
		Node prevNode = search(idx - 2);
		Node nextNode = tempNode.nextNode;
		
		prevNode.nextNode = nextNode;
		size--;
		return tempNode.data;
	}
	public void printAll() {
		Node pointer = this.head;
		
		StringBuilder sb = new StringBuilder();
		while(pointer.nextNode != null) {
			sb.append(pointer.data);
			sb.append(" => ");
			pointer = pointer.nextNode;
		}
		sb.append(pointer.data);
		System.out.println(sb.toString());
		
	}
	

}
