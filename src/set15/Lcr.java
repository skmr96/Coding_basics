import java.util.*;

// PROGRAM TO PRINT LARGEST CONTINUOUS RANGE

public class Lcr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={13,14,15,1,2,3,4,6,7,8,9,10,11};
		int b[]=new int[a.length];
		Arrays.sort(a);
		int k=0,f=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]==1)
			{
				if(f==0)
				{
					k=i;
					f=1;
				}
				b[k]++;
				
			}
			if(a[i+1]-a[i]!=1)
			{
				f=0;
			}
		}
		//Arrays.sort(b);
		//for(int i=0;i<b.length;i++)
			//System.out.print(b[i]+" ");
		int max=0,index=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
				index=i;
			}
		}
	///	System.out.println(max+" "+index);
		int l=0;
		while(l<=max)
		{
			System.out.print(a[index++]+" ");
			l++;
		}
			
	}

}
