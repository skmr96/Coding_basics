//$Id$
package Testprograms;

public class QueueInt implements queue{
	
	private int front=0;
	private int rear=0;
	private int size;
	private int elements[];
	
	public QueueInt(int size)
	{
		this.size=size;
		elements = new int[size];
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full "+data+" cannot be inserted");
		}
		else{
		elements[rear++] = data;
		}
	}
	
	public boolean isFull()
	{
		if(rear==size)
			return true;
		return false;
		
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty no dequeue can be performed");	
			return -1;
		}
		else{
		int value = elements[front++];
		shift();
		return value;
		}
	}
	
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		return false;
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
	
	public int getFrontValue()
	{
		return elements[front];
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
	
	public boolean equals(QueueInt q)
	{
		for(int i=0;i<size;i++)
		{
			if(elements[i]!=q.elements[i])
				return false;
		}
		return true;
	}
	private void shift()
	{
		for(int si=0;front<rear;si++,front++)
		{
			elements[si]=elements[front];
		}
		front=0;
		rear--;
	}
}
