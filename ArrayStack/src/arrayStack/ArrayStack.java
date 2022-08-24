package arrayStack;

public class ArrayStack {
	Object[] stack;
	int top;

	public ArrayStack(int length) {
		this.top = -1;
		this.stack = new Object[length];
	}
	public void push(Object data) {
		if(top == stack.length - 1)
			throw new StackOverflowError();
		
		stack[++top] = data;
	}
	public Object pop() {
		
		if(top == -1)
			throw new ArrayIndexOutOfBoundsException();
		
		Object temp = stack[top];
		stack[top--] = null;
		return temp;
	}
	public Object peek() {
		return stack[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
}
