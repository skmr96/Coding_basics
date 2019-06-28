import java.util.Arrays;
import java.util.Scanner;

/*
 * Input:
He did a good deed
Output:
He good

Input:
Hari speaks malayalam
Output:
Hari speaks
 */
public class Third {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String m = "Hari speaks malayalam";//in.nextLine();
		String n[] = m.split(" ");
		String o[] = n.clone();//String o[] = m.split(" ");
		for (int i=0;i<n.length;i++)
		{
			StringBuffer s = new StringBuffer(n[i]);
			StringBuffer t = new StringBuffer(o[i]);
			if(!t.toString().equals(s.reverse().toString()))
			{
				System.out.print(t+" ");
			}
				
		}
		System.out.println();
		for(int i=0;i<n.length;i++)
		{
			char ch1[]=n[i].toCharArray();
			char ch2[]=new char[ch1.length];
			for(int j=0,k=ch1.length-1;j<ch1.length;j++,k--)
			{
				ch2[j]=ch1[k];
			}
			if(!Arrays.equals(ch1, ch2))
			{
				System.out.print(ch1);
				System.out.print(" ");
			}
				
		}
	}

}
