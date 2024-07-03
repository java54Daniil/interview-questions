package telran.interviews;

import java.util.EmptyStackException;
import java.util.Stack;

//All methods should have complexity O[1] 
public class MyStackInt {
	
	private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    public MyStackInt() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
	public void push(int num) {
		//adds num into top of stack
		  stack.push(num);
	        if (maxStack.isEmpty() || num >= maxStack.peek()) {
	            maxStack.push(num);
	        }
	}
	public int pop() {
		
		//removes element from top of stack(last element)
		//returns removed number
		//throws exception if the stack is empty
		 if (stack.isEmpty()) {
	            throw new EmptyStackException();
	        }
	        int popped = stack.pop();
	        if (popped == maxStack.peek()) {
	            maxStack.pop();
	        }
	        return popped;
		
	}
	public int peek() {
		//returns last number
		//throws exception if the stack is empty
		 if (stack.isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack.peek();
	}
	public boolean isEmpty() {
		//returns true if the stack is empty,otherwise false\
		return stack.isEmpty();
	}
	public int getMaxElement() {
	
		//returns the max number from the stack
		if (maxStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return maxStack.peek();
	}
	
}
