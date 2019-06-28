
//Sample:   house no : 123@ cbe 
//Output:   ebc32 1o : nes@ uoh
import java.util.*;
public class Three {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String m = in.nextLine();
		char ch[] = m.toCharArray();
		ArrayList<Character> a = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]) || Character.isDigit(ch[i]))
			a.add(ch[i]);
		}
		int k = a.size();
		k--;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]) || Character.isDigit(ch[i]))
			{
				ch[i]=a.get(k);
				k--;
			}
			else 
			{
				ch[i]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		System.out.print(ch[i]);
		}
	}


