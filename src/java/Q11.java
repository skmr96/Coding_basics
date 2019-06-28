package zoho;
// ANAGRAMS
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1= in.next();
		String s2= in.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
			System.out.println("t");
		else
			System.out.println("f");
		
		

	}

}
