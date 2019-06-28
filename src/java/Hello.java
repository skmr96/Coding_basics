/*
2.	To balance the given input paranthesis  and print the result of balanced paranthesis 
INPUT		OUPUT
((()((( 			2
()()((((			4
)))((((			0
*/



package zoho;
import java.util.*;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg= in.next();
		int c=0;Stack st = new Stack();
		char ch[] = msg.toCharArray();

		for (int i=1;i<ch.length;i++)
		{
			
			if(ch[i]=='(')
				st.push(ch[i]);
			if(ch[i]==')')
			{
				st.pop();
				c=c+2;
			}
				
				
		}
		System.out.println(c);

		

}
}
