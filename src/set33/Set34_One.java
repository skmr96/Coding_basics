import java.util.Stack;

/*
 * Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece”
 */

public class Set34_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "expErIence";
		String s1 = "En";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			s3="";
			for(int j=0;j<s2.length();j++)
			{
				
				if(s1.charAt(i)!=s2.charAt(j))
				{
					s3=s3+s2.charAt(j);
				}
			}
			s2=s3;
		}
		System.out.println(s3);
		
/*		
		Stack<Integer> s= new Stack<Integer>();
		s.push(1);
		s.push(45);
		s.push(32);
		s.push(23);
		int h= s.search(1);
		System.out.println(h);
		
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=5-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
*/			
	}

}
