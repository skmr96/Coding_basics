package zoho;
// REMOVING LETTERS TO MAKE IT AS AN ANAGRAM
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);int j,c=0;
		String s1= in.next();int count;
		String s2= in.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1.length==ch2.length)
		{
		for(int i=0;i<ch1.length;i++)
		{
			for(j=0;j<ch2.length;j++){
		if(ch2[j]==ch1[i])
			c++;
			}
		}
		if(c!=0){
		 count = 2*(ch1.length-c);
		 System.out.println(count);}
		else
			System.out.println("no letters");
		
		
		}
		else
			System.out.println("no lenght");
	}

}
