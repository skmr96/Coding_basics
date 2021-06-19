//$Id$

import Testprograms.*;

public class QueueImpUsingStack implements queue {
	
	private int size=0;
	private stack first_stack;
	private stack second_stack;
	public QueueImpUsingStack(int size)
	{
		this.size=size;
		first_stack = new StackInt(size);
		second_stack = new StackInt(size);
	}

	public void enqueue(int data)
	{
		while(!second_stack.isEmpty())
			{
				int value =second_stack.pop(); 
				first_stack.push(value);
			}
		first_stack.push(data);		
	}
		
	public int dequeue()
	{
		while(!first_stack.isEmpty())
			{
				int value = first_stack.pop();
				second_stack.push(value);
			}
		if(isEmpty())
			return -1;
		return second_stack.pop();	
	}
	
	public int getFrontValue()
	{
		return second_stack.getPeekValue();
	}
	
	public boolean isEmpty()
	{
		if(first_stack.isEmpty() && second_stack.isEmpty())
			return true;
		return false;
	}
}
