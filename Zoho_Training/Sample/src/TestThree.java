//$Id$

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImpUsingStack first = new QueueImpUsingStack(10);
		
		first.enqueue(1);
		first.enqueue(2);
		first.enqueue(3);
		first.enqueue(4);
		first.enqueue(5);
		first.enqueue(6);
		
		first.dequeue();
		
		first.enqueue(7);
		
		first.dequeue();
		
		System.out.println(first.getFrontValue());

	}

}
