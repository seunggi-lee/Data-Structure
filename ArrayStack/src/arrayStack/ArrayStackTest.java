package arrayStack;

public class ArrayStackTest {

	public static void main(String[] args) {
		
		ArrayStack ar = new ArrayStack(3);
		ar.push("1");
		ar.push("2");
		ar.push("3");
		
		System.out.println(ar.pop());
		System.out.println(ar.pop());
		System.out.println(ar.pop());
		
	}

}
