//$Id$
import Testprograms.QueueInt;
public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueInt q = new QueueInt(10);
		//q.setSize(10);
	//	q.getSize();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		q.dequeue();
		q.enqueue(11);
		q.dequeue();
		q.enqueue(12);
		q.dequeue();
		q.enqueue(13);
	
	System.out.println(q.dequeue());	
	
		
	}

}
