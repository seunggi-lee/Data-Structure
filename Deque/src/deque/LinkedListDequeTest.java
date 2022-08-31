package deque;

public class LinkedListDequeTest {

	public static void main(String[] args) {
		LinkedListDeque lld = new LinkedListDeque();
		
		lld.addFirst("100");
		lld.addLast("200");
		lld.addLast("300");
		lld.addLast("400");
		lld.addLast("500");
		lld.addLast("600");
		lld.addLast("700");
		
		System.out.println(lld.printAll());
		
		lld.removeFirst();
		lld.removeLast();
		System.out.println(lld.printAll());
		lld.removeFirst();
		System.out.println(lld.printAll());
	}

}
