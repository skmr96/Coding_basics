//$Id$

public class TestFive {

	public static void main(String[] args) {
	
		StackofStacks first = new StackofStacks(5);
		
		//first.setSize(5);
		int which_stack=1;
		
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
		first.push(12);
		first.push(13);
		//first.push(14);
	//	first.push(15);
	//	first.push(16);
		
	/*	first.pop(which_stack);
		first.pop(which_stack);
		first.pop(which_stack);
		first.pop(which_stack);
		first.pop(which_stack);
		
		first.push(14);
		first.pop(which_stack);
		which_stack=3;
		first.pop(which_stack);
		which_stack=2;
		first.pop(which_stack);
		
		which_stack=3;
		first.pop(which_stack);
		
		first.pop();
		which_stack=2;
		
		first.pop(which_stack);
		first.pop(which_stack);
		
		System.out.println(first.pop(which_stack)); */
		
		first.pop();first.pop();
		System.out.println(first.pop());
		System.out.println(first.pop());
		
		which_stack =1;
		System.out.println(first.pop(which_stack));
		
		System.out.println(first.pop());
		System.out.println(first.pop());
		which_stack=3;
		System.out.println(first.pop(which_stack));
		
		/*	System.out.println(first.pop());
		System.out.println(first.pop());
		System.out.println(first.pop());
		System.out.println(first.pop());
		

		System.out.println(first.pop());
		System.out.println(first.pop());
		System.out.println(first.pop());
		System.out.println(first.pop());
		
		System.out.println(first.pop());
		System.out.println(first.pop());
		System.out.println(first.pop());
		
*/
	}

}
