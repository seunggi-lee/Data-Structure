package circularLinkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedList cLL = new CircularLinkedList();
		
		cLL.addFirst("50");
		cLL.addFirst("30");
		cLL.addFirst("100");
		
		cLL.printAll();
		
		cLL.addLast("110");
		cLL.addLast("120");
		cLL.addLast("130");
		
		cLL.printAll();
		
		cLL.add("300", 3);
		cLL.add("230", 5);
		
		cLL.printAll();
		
		cLL.removeFirst();
		cLL.printAll();
		
		cLL.removeLast();
		cLL.printAll();
		
		cLL.removeFirst();
		cLL.printAll();
		
		cLL.remove(1);
		cLL.printAll();
		
		cLL.remove(2);
		cLL.printAll();
		
		cLL.addLast("300");
		cLL.addFirst("230");
		cLL.printAll();
	}

}
