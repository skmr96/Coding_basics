import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		int n = sn.nextInt();
		int a[] = new int[n];
		for(int k=0;k<a.length;k++){
		   a[k]=sn.nextInt(); 
		}
		for(int j=0;j<t;j++)
		{
		for(int i=0;i<n;i++)
		{
		    if(((n-1)-i)<i)
		    break;
		    else
		    {
		    System.out.print(a[n-1-i]);
		    System.out.print(a[i]);
		    }
		 }
		}
	}
}