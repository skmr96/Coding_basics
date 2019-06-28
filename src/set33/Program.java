import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);int i,j,k,l,n;
		String msg= in.next();
		char ch[] = msg.toCharArray();
		n=ch.length-1;
		for(i=0,l=n;i<ch.length;i++,l--)
		{
			if(i==l)
			{
				for(j=0;j<i;j++)
				System.out.print(" ");
				System.out.println(" "+ch[i]);
				i++;
				l--;
				break;
			}
			
			for(j=0;j<i;j++)
				System.out.print(" ");
			System.out.print(ch[i]);
			for(k=i;k<n-i;k++)
				System.out.print(" ");
			System.out.println(ch[l]);

		}
		for(;i<ch.length;i++,l--)
		{
			for(j=0;j<l;j++)
				System.out.print(" ");

			System.out.print(ch[l]);
			for(k=l;k<n-l;k++)
				System.out.print(" ");
			System.out.println(ch[i]);
		}
	

	}

}
