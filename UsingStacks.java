
public class UsingStacks {
	
	public static void main(String[] args) {
		
		String infix = "5+3*(2+1)+8*3/4";
		int result = evalInfix(infix);
		
		System.out.println(infix + " = "+ result);
	}
	
	public static int evalInfix(String infix) {
		String postfix = infix2Postfix(infix);
		
		return evalPostfix(postfix);
		
	}
	
	public static int evalPostfix(String postfix) {
		
//		Stack stack = new Stack(postfix.length());
		
		StackIntLL stack = new StackIntLL();

		
		for(int i = 0; i < postfix.length(); i++) {
			
			char op = postfix.charAt(i);
			
			if(isOperand(op)) {
				stack.push(postfix.charAt(i) - '0');
			}
			else {
				int b = stack.top();
				stack.pop();
				
				int a = stack.top();
				stack.pop();
				
//				if(op == '^') stack.push(a * b);
				if(op == '*') stack.push(a * b);
				if(op == '/') stack.push(a / b);
				if(op == '+') stack.push(a + b);
				if(op == '-') stack.push(a - b);
			}
		}
		
		
		return stack.top();
		
	}
	
	public static String infix2Postfix(String infix) {
		
		String postfix = "";
		
		StackChar stack = new StackChar(infix.length());
		
		for(int i = 0; i < infix.length(); i++) {
			
			char op = infix.charAt(i);
			
			if(isOperand(op)) {
				postfix += op;

			}
				else if(op == '(') {
					stack.push(op);
				}
					else if(op == ')' ) {
						while(stack.top() != '(') {
							postfix += stack.top();
							stack.pop();
						}
						
						stack.pop();
					}
			else {
				while(( !stack.isEmpty()) && (prec(stack.top()) >= prec(op))) {
					postfix += stack.top();
					stack.pop();
				}
				stack.push(op);
			}
			}
		
		while(!stack.isEmpty()) {
			postfix += stack.top();
			stack.pop();
		}
		
		return postfix;
			
	}
	
	public static int prec(char op) {
		
		if(op == '+') return 1;
		if(op == '-') return 1;
		if((op == '*') || (op == '/'))  return 2;
		if(op == '^') return 3;

		return 0;
	}
	
	public static boolean isOperand(char op) {
		return (op >=  '0') && (op <=  '9');
	}

}
