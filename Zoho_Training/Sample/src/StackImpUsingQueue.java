//$Id$
import Testprograms.*;
public class StackImpUsingQueue implements stack {
	
	private int size;
	private	queue first_queue ;
	private	queue second_queue;
	private	queue temp_queue ;
		
		public StackImpUsingQueue(int size)
		{
			this.size = size;
			first_queue = new QueueInt(size);
			second_queue = new QueueInt(size);
			temp_queue = new QueueInt(size);
		}
			
		public void push(int data)
		{
			first_queue.enqueue(data);
			while(!second_queue.isEmpty())
			{
				int value =second_queue.dequeue(); 
				first_queue.enqueue(value);
			}
			temp_queue=first_queue;
			first_queue=second_queue;
			second_queue=temp_queue;		
		}
		
		public int pop()
		{
			if(isEmpty())
				return -1;
			return second_queue.dequeue();
		}
		
		public int getPeekValue()
		{
			return second_queue.getFrontValue();
		}
		
		public boolean isEmpty()
		{
			if(second_queue.isEmpty())
				return true;
			return false;
		}
	
}
