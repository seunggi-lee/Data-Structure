package doubleLinkedList;

public class DoubleLinkedListTest {

	public static void main(String[] args) {
		DoubleLinkedList dLL = new DoubleLinkedList();
		dLL.addFirst("50");
		dLL.addFirst("30");
		dLL.addFirst("100");
		
		dLL.addLast("110");
		dLL.addLast("120");
		dLL.addLast("130");
		
		dLL.add(3, "300");
		dLL.add(5, "230");
		
		dLL.printAll();
		
		dLL.removeFirst();
		dLL.printAll();
		
		dLL.removeLast();
		dLL.printAll();
		
		dLL.removeFirst();
		dLL.printAll();
		
		dLL.remove(1);
		dLL.printAll();
		
		dLL.remove(2);
		dLL.printAll();
		
		dLL.addLast("300");
		dLL.addFirst("230");
		dLL.printAll();
	}

}
