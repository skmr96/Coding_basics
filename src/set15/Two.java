//Sample: 
//Array : {­2, 7, 5, ­1, 3, 2, 9, ­7} 

//Output: 
  //   Sum : 14 
   //  Elements : 3, 2, 9 


import java.util.*;
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-2, 7, 5, -1, 3, 2, 9, -7, -8};
		int h=0,j=Integer.MIN_VALUE,start=0,end=0,s=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0 && i!=a.length-1)
			{
				h=0;
				s=i+1;
				continue;
		
			}
				h=h+a[i];		
				if(j<h)
				{
					j=h;
					start=s;
					end=i;
				}

		}
		System.out.println(j);
		for(int i=start;i<=end;i++)
				System.out.print(a[i]+" ");
				

	}

}
