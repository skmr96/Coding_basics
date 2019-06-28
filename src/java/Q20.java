package zoho;
// MERGED ARRAY REMOVING DUPLICATES USING TREESET
import java.util.*;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);int i;
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(i=0;i<n1;i++)
		{
			int m = in.nextInt();
			ts.add(m);
		}
		for(i=0;i<n2;i++)
		{
			int m = in.nextInt();
			ts.add(m);
		}

		System.out.println(ts);

	}

}
