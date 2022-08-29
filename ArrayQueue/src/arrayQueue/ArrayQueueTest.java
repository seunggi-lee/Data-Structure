package arrayQueue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue ar = new ArrayQueue(5);
		
		ar.enQueue(10);
		ar.enQueue(20);
		ar.enQueue(30);
		ar.enQueue(40);
		ar.enQueue(50);
		System.out.println(ar.isFull());
		
		for(int i = 0; i< ar.size; i++) {
			System.out.println(ar.deQueue());
		}
		System.out.println(ar.isFull());
		
	}

}
