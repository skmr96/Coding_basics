//Second maximum
//

import java.util.*;
public class SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		int max[]=new int[2];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		max[0]=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max[0])
			{
				max[1]=max[0];
				max[0]=a[i];
			}
			else if(a[i]>max[1] && a[i]!=max[0])
			{
				max[1]=a[i];
			}
			
		}
		System.out.println(max[1]);
		
	}

}
