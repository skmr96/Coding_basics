//Remove duplicates from Unsorted  and sorted array
import java.util.*;
public class Rdunsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,3,1};
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			while(i<n-1 && a[i]==a[i+1] )
				i++;
			System.out.print(a[i]+" ");
		}
		//Using HashSet
		HashSet<Integer> ha = new HashSet<Integer>();
		for(int i=0;i<n;i++)
			ha.add(a[i]);
		System.out.println("\n" + "Using HashSet");
		System.out.println(ha);

	}

}
