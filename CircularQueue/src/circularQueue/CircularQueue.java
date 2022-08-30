package circularQueue;

public class CircularQueue {
	private Object ar[];
	int max_size;
	private int front;
	private int rear;
	
	public CircularQueue(int size) {
		this.max_size = size + 1;
		this.ar = new Object[max_size];
		this.front = 0;
		this.rear = 0;
	}
	
	public void enequeue(Object data) {
		if((rear + 1) % max_size == front)
			throw new ArrayIndexOutOfBoundsException();
		rear = (rear + 1) % max_size;
		ar[rear] = data;
	}
	public Object dequeue() {
		if(front == rear)
			throw new ArrayIndexOutOfBoundsException();
		
		front = (front + 1) % max_size;
		Object temp = ar[front];
		ar[front] = null;
		
		return temp;
	}
	
	
	
	
}
