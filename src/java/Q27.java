package zoho;
import java.util.*;
public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		int m = in.nextInt();int n = in.nextInt();
		for(int i=0;i<m;i++)
			a1.add(in.nextInt()); 
		for(int i=0;i<n;i++)
			a2.add(in.nextInt());
		System.out.println("Union");
		System.out.println(a1.addAll(a2));
		System.out.println("Intersection");
		for(int i=0;i<a2.size();i++)
		{
			if(a1.contains(a2))
				a3.add(a1.get(i));
		
		}
		System.out.println(a3);

	}

}
