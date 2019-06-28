package set33;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "joy";
		String s2 = "enjoy";
		
		String s3[] = s1.split(" ");
		String s4[] = s2.split(" ");
		String m="";
		String n="";
		for(int i=0;i<s3.length;i++)
			m=m+s3[i];
		for(int i=0;i<s4.length;i++)
			n=n+s4[i];
		char c1 [] = m.toLowerCase().toCharArray();
		char c2 [] = n.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
			System.out.println("Anagram");
	}

}
