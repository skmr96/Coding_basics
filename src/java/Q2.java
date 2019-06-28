/*
 * o balance the given input paranthesis  and print the result of balanced paranthesis 
INPUT		OUPUT
((()((( 			2
()()((((			4
)))((((			0
Explanation:	In first case only two paranthesis so result is 2, In Second case only 4 paranthesis are balanced. In last case no balanced paranthesis is found

*/
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg= in.next();int o=0;
		int c=0;Stack st = new Stack();
		int flag=0;
		char ch[] = msg.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]==')' && flag==0)
			{
				i++;
			}
			if(ch[i]=='(')
			{
				o++;flag=1;
			}
			if(ch[i]==')' && flag==1)
				c++;
			}
		if(o==c)
			System.out.println(o*2);
		else if(o<c)
				System.out.println(o*2);
			else
				System.out.println(c*2);
		
	}

}
