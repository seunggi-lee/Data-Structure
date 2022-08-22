package linkedListTest;


public class LinkedListTest_1 {

	public static void main(String[] args) {
		
		SinglLinkedList sLL = new SinglLinkedList();
		sLL.addFirst("30");
		sLL.addFirst("20");
		sLL.addLast("10");
		sLL.addLast("0");
		sLL.add("100", 2);
		
		sLL.printAll();
		
		sLL.removeFirst();
		sLL.printAll();
		
		sLL.removeLast();
		sLL.printAll();
		
		sLL.addLast("1111");
		sLL.addLast("2323");
		sLL.addLast("56456");
		sLL.printAll();
		
		sLL.remove(4);
		sLL.printAll();
	}

}
