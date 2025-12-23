
public class Stack {
	private int[] A;
	
	private int top = -1;
	
	public Stack(int size) {A = new int[size];}
	
	public void push(int item) {
		
		top++;
		
		if(top == A.length) reSize();
		
		A[top] = item; 
	}
	
	public void pop() { top--;}
	
	public int top() { return A[top];}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void reSize() {
		int[] B = new int[A.length * 2];
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		 A = B;
	}

}
