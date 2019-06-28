//Sample:   one two three 
//Output :  three two one
import java.util.*;
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String m = in.nextLine();
		String s[]=m.split(" ");
		for(int i=s.length-1;i>=0;i--)
			System.out.print(s[i]+" ");
	}

}
