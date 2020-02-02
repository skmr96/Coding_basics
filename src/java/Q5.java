import java.util.*;	// BALANCED PARANTHESIS 
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg= in.next();
		int i,flag=0;
		Stack<Character> s = new Stack<Character>();
		char ch[] = msg.toCharArray();
	for(i=0;i<ch.length;i++)
	{
		if((ch[i]=='}' || ch[i]==']' || ch[i]==')') && flag==0  )
			{
				s.push(ch[i]);
				i++;
			}
		if(ch[i]=='{' || ch[i]=='[' || ch[i]=='('  )
			{
			s.push(ch[i]);
			flag=1;
			}
		if(ch[i]=='}' && flag==1  )
		{
			char ca = (!s.isEmpty())?(s.pop()) :'0';
			if(ca!='{'){
				s.push(ca);}
		}
		if(ch[i]==')' && flag==1  )
		{
			char ca = (!s.isEmpty())?(s.pop()) :'0'  ;
			if(ca!='('){
				s.push(ca);}
		}
		if(ch[i]==']' && flag==1  )
		{
			char ca = (!s.isEmpty())?(s.pop()) :'0';
			if(ca!='['){
				s.push(ca);}
		}
	}
		if(s.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
