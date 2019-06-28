package zoho;

//LETTERS TO CHANGE IN SECOND STRING TO MAKE IT AS AN ANAGRAM
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);int i,j,c=0,r;
		String s1= in.next();
		String s2= in.next();in.close();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1.length==ch2.length){
		for(i=0;i<ch1.length;i++)
		{
			for(j=0;j<ch2.length;j++)
			{
				if(ch2[j]==ch1[i]){
					ch1[i]=1;
					c++;}
			}
		}
		r=ch1.length-c;
		System.out.println(r+" letters to change to make it as a anagram");
		}
		else
			System.out.println("not same length");
	}

}
