import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int ar[][] = new int[m][m];
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[0].length;j++)
				ar[i][j]=in.nextInt();
		
	//	for(int i=0;i<a.length;i++)
		//	for(int j=0;j<a[0].length;j++)
			//	System.out.println(a[i][j]);
		
		int n = in.nextInt();
		int s[][] = new int[n][n];boolean b=false;
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s[0].length;j++)
				s[i][j]=in.nextInt();
		
		String str="";
		
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s[0].length;j++)
				 str = str+s[i][j];
		
	int f=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[0].length;j++)
			{
				if(ar[i][j]==s[0][0])
				{
					b=func(ar,i,j,n,m,str);
					if(b){
					j=ar[0].length;
					f=1;
					}
				}
			}
			if(f==1){
				i=ar.length;
			}				
		}
		if(b)
			System.out.println("yes");
		else
			System.out.println("no");
}
	static boolean func(int ar[][],int i,int j,int n,int m,String str)
	{
		int p=i,q=j,a=0;
		String s = "";
		if(i==m-1 || j==m-1){
			System.out.println("Element is there in last row");
			return false;
		}
		for(int i1=p;a<n;i1++,a++)
		{
			for(int j1=q,b=0;b<n;j1++,b++)
			{
				
				s= s+ar[i1][j1];
			}
		}
		System.out.println(s);
		System.out.println(str);
		if(s.equals(str))
			return true;
		else
			return false;
	}

	}


