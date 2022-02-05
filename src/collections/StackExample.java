package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		
		stack1.push(1);
		stack1.push(2);
		stack1.push(6);
		stack1.pop();
		stack1.push(8);
		
		
	System.out.println(stack1);
	System.out.println(stack1.peek());// to show the last element came to stack
		
			

	}

}
