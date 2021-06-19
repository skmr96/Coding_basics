//$Id$
package Testprograms;

public interface queue {
	
	void enqueue(int data);
	int dequeue();
	int getFrontValue();
	boolean isEmpty();

}
