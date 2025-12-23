
public class StackChar {
	private char[] A;
		
	private int top = -1;
		
	public StackChar(int size) {A = new char[size];}
		
	public void push(char item) {
		top++;
		A[top] = item; 
	}
		
	public void pop() { top--;}
		
	public char top() { return A[top];}
		
	public boolean isEmpty() {
		return top == -1;
	}

}
