//$Id$
import Testprograms.*;
import java.util.*;
public class StackofStacks implements stack{
	
	ArrayList<StackInt> stack_array = new ArrayList<StackInt>();
	
	private int size,check_stack_size=0,c=0;

	StackInt using_stack ;
	StackInt view_stack ;
	StackInt new_stack;
	
	public StackofStacks(int size)
	{
		this.size=size;
		using_stack = new StackInt(size);
		view_stack = new StackInt(size);	
	}
	
	public void push(int data)
	{
		if(check_stack_size==size)
		{
			stack_array.add(using_stack);
			new_stack = new StackInt(size);
			using_stack=new_stack;
			
			check_stack_size=0;
			
		}
		using_stack.push(data);	
		check_stack_size++;				
	}
	
	public int pop()
	{
		if(using_stack.isEmpty())
		{ 
			if( stack_array.size()>0)
			{	
				using_stack=stack_array.get(stack_array.size()-1);
				stack_array.remove(stack_array.size()-1);
			}
		}
		return using_stack.pop();
	}
	public int pop(int which_stack)
	{
		which_stack--;
		stack_array.add(using_stack);
		view_stack=stack_array.get(which_stack);
			
		if(view_stack.isEmpty() && which_stack!=0){
			view_stack=stack_array.get(--which_stack);
		}	
		return view_stack.pop();		
	}

	@Override
	public int getPeekValue() {
		return using_stack.getPeekValue();
	}

	@Override
	public boolean isEmpty() {
		
		if(using_stack.isEmpty())
			return true;
		else
			return false;
	}
	
	
}
