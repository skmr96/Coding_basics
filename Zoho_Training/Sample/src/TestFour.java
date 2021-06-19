//$Id$

public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImpUsingQueue first_stack = new StackImpUsingQueue(10);
			
		//first_stack.push(5);
		//first_stack.push(4);
	//	first_stack.push(3);
//		first_stack.push(2);
	//	first_stack.push(1);
		
		System.out.println(first_stack.pop());
		
		first_stack.push(6);
		
		System.out.println(first_stack.pop());
	}

}
