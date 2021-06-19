//$Id$
package Testprograms;

public class StackInt implements stack{
	
	private int top=0;
	private int size;
	private int elements[];
	
	public StackInt(int size){
		this.size = size;
		elements = new int[size];
	}
	
	 public void push(int data)
	{
		if(isFull())
			System.out.println("Stack is Full and "+data+" cannot be inserted " );
		else{
		elements[top]=data;
			top++;			
		}
	}
	 private boolean isFull()
		{
			if(top==size)
				return true;
			return false;
			
		}
	 public int pop()
		{
			if(isEmpty())
			{
				System.out.println("Stack is empty no pop operations can be done");
				return -1;
			}
			else{
			return (elements[--top]);
			}
		}
	public boolean isEmpty()
		{
			if(top==0)
				return true;
			return false;
		}
	
	public int getPeekValue()
	{
		if(isEmpty())
			return -1;
		int element = top;
		return (elements[--element]);
	}
	
	public boolean contains(int data)
	{
		for(int element=0;element<size;element++)
		{
			if(data==elements[element]){
				return true;
			}
		}
		return false;	
	}
	public int indexOf(int data)
	{
		for(int i=0;i<size;i++)
		{
			if(elements[i]==data){
				return i;
			}
		}
		return -1;
	}
	
	public boolean equals(StackInt s)
	{
		for(int i=0;i<size;i++)
		{
			if(elements[i]!=s.elements[i])
				return false;
		}
		return true;
	}
	
	public void mergeStack(StackInt s)
	{
		while(!s.isEmpty())
			push(s.pop());
	}
	
	public int getMinValue()
	{
		int min = elements[0];
		for(int i=1;i<size;i++)
			if(min>elements[i])
				min=elements[i];
		return min;
	}
	
	public int getMaxValue()
	{
		int max = elements[0];
		for(int i=1;i<size;i++)
			if(max<elements[i])
				max=elements[i];
		return max;
	}

}
