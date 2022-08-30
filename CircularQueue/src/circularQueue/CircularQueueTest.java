package circularQueue;

public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		
		cq.enequeue("one");
		cq.enequeue("two");
		cq.enequeue("three");
		cq.enequeue("four");
		cq.enequeue("five");
		
		for(int i = 0; i < cq.max_size -1; i++) {
			System.out.println(cq.dequeue());
		}
	}

}
