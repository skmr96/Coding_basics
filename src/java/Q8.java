package zoho;

import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String msg=in.next();int flag=0;
		String ms="";
		String let="";
		char ch[]=msg.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(Character.isLetter(ch[i]))
		{
			if(flag==1)
			{
				show(let,ms);
				flag=0;
				let="";
				ms="";
			}
			let=let+ch[i];
		}
		if(Character.isDigit(ch[i]))
		{
			ms=ms+ch[i];
			flag=1;
		}
		if(i==ch.length-1)
		{
			show(let,ms);
			flag=0;
			let="";
			ms="";
		}
		
		
		}
	}
	static void show(String let,String ms)
	{
		int times = Integer.parseInt(ms);
		for(int i=0;i<times;i++)
			System.out.print(let+"");
		
	}

}
