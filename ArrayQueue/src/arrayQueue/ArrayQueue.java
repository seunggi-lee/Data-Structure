/*
 * CircularQueue의 front는 항상 비어있는 것인가?
 * 오랜만에 다시 하려고 하니까 개념이 헷갈린다.
 * 한 번 찾아보는 것이 좋을 것 같음.
 * */

package arrayQueue;

public class ArrayQueue {
	private Object[] arr;
	public int size;
	private int front;
	private int rear;
	private int peek;
	
	public ArrayQueue(int size) {
		this.arr = new Object[size];
		this.size = size;
		this.front = 0;
		this.rear = -1;
		this.peek = this.front;
	}
	
	public void enQueue(Object data) {
		if(size - 1 == rear)
			throw new StackOverflowError();
		this.arr[++rear] = data;
	}
	
	public Object deQueue() {
		if(front >= size)
			throw new ArrayIndexOutOfBoundsException();
		
		Object temp = arr[front];
		arr[peek] = null;
		peek++;
		front++;
		
		return temp;
	}
	public Object peek(Object data) {
		return arr[peek];
	}
	public boolean isFull() {
		return rear == size - 1;
	}


}
