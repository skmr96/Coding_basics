//$Id$
import Testprograms.StackInt;
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackInt first = new StackInt(10);
	
		first.push(1);
		first.push(2);
		first.push(3);
		first.push(4);
		first.push(5);
		first.push(6);
		first.push(7);
		first.push(8);
		first.push(9);
		first.push(10);
		first.push(11);
		first.pop();
		first.push(11);
		first.pop();
		
		System.out.println(first.pop()); 
		
		StackInt s1 = new StackInt(5);
		StackInt s2 = new StackInt(5);
		s1.push(1);
		s1.push(2);
		
		s2.push(3);
		s2.push(4);
		
		System.out.println(s1.getPeekValue());
		
		s1.mergeStack(s2);
		
		System.out.println(s1.getPeekValue());
		
		System.out.println(s1.getMinValue());

	
	}

}
