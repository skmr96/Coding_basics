//Input:
//Number of digits:12
//9 2 8 1 3 5 6 7 3 1 1 6
//Number of digits:9
//7 8 4 6 2 1 9 9 7
//Output :
//9 2 8 9 2 0 2 9 5 1 1 3

import java.util.*;
public class Set18One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n1];
		int d[]=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=in.nextInt();
		for(int i=0;i<n2;i++)
			b[i]=in.nextInt();
		for(int i=0;i<n1-n2;i++)
			c[i]=0;
		for(int i=n1-n2,j=0;j<n2;i++,j++)
			c[i]=b[j];
		
		
		int carry=0,sum=0,r=0;
		for(int i=n1-1;i>=0;i--)
		{
			if(c[i]!=0)
			{
				sum=a[i]+c[i]+carry;
				r=sum%10;
				carry=sum/10;
				d[i]=r;
			}
			else
			{
				d[i]=a[i];
			}
		}
		for(int i=0;i<n1;i++)
			System.out.print(d[i]+" ");
	}

}
