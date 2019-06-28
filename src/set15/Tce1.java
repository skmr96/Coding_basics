//IT CANNOT BE USED AS START=0 AND END=0 WILL REMOVE THE FIRST INDEX OF THE STRING 


public class Tce1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcd";
		char ch[]=a.toCharArray();
		int flag=0,n=0,unflag=0,start=0,end=0;
		while(n<2)
		{
			for(int i=0;i<ch.length-1;i++)
			{
				if(ch[i]==ch[i+1] && flag==0)
				{
					start = i;
					flag=1;					
				}
				if(ch[i]!=ch[i+1] && flag==1)
				{
					end=i;
					flag=0;
				}		
			}
			ch=duplicat(ch,start,end);
			n++;
		}
	}
	public static char[] duplicat(char ch[],int start,int end)
	{
		for(int i=start; i<=end;i++)
			ch[i]='#';
		String m="";
		for(int i=0;i<ch.length;i++)
			if(ch[i]!='#')
			{
				m=m+ch[i];
			}
		System.out.println(m);
		char cha[]=m.toCharArray();
		return cha;

	}


}
