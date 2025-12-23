
public class StackIntLL {
	private Node top = null;
	
	
	
	public void push(int x) {
		top = new Node(x, top);
						
	}
	
	public void pop() {
		top = top.next;
	}
	
	public int top() {
		return top.item;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
}
